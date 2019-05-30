package cn.netdiscovery.fxh;

import cn.netdiscovery.core.Spider;
import cn.netdiscovery.core.SpiderEngine;
import cn.netdiscovery.fxh.parser.FXHParser;

/**
 * Created by tony on 2019-05-28.
 */
public class Main {

    public static void main(String[] args) {

        SpiderEngine engine = SpiderEngine.create();

        Spider spider = Spider.create()
                .name("bitcoin")
                .url("https://dncapi.bqiapp.com/api/coin/market_ticker?page=1&pagesize=10&code=bitcoin&token=&webp=1")
                .parser(new FXHParser());

        engine.addSpider(spider)
                .run();
    }
}
