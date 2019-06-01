package cn.netdiscovery.fxh;

import cn.netdiscovery.core.Spider;
import cn.netdiscovery.core.SpiderEngine;
import cn.netdiscovery.core.config.PropertyParser;
import cn.netdiscovery.core.domain.Request;
import cn.netdiscovery.fxh.parser.FXHParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by tony on 2019-05-28.
 */
public class Main {

    public static void main(String[] args) {

        PropertyParser propertyParser = new PropertyParser();
        Map<String, Object> property = null;
        try {
            property = propertyParser.decode(Main.class.getResourceAsStream("/cryptocurrency.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Request> requestList = new ArrayList<>();

        property.entrySet()
                .stream()
                .forEach(stringObjectEntry -> {

                    String url = String.format("https://dncapi.bqiapp.com/api/coin/market_ticker?page=1&pagesize=10&code=%s&token=&webp=1",stringObjectEntry.getValue());
                    Request request = new Request(url,"tony");
                    request.putExtra("short_name",stringObjectEntry.getKey());
                    requestList.add(request);
                });

        Request[] requests = requestList.stream().toArray(Request[]::new);

        SpiderEngine engine = SpiderEngine.create();

        Spider spider = Spider.create().name("tony").request(requests).parser(new FXHParser());

        engine.addSpider(spider).run();

        engine.addSpiderJob(spider.getName(),"0 */5 * * * ?", requests);
    }
}
