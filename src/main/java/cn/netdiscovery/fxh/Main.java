package cn.netdiscovery.fxh;

import cn.netdiscovery.core.Spider;
import cn.netdiscovery.core.SpiderEngine;
import cn.netdiscovery.core.queue.disruptor.DisruptorQueue;
import cn.netdiscovery.fxh.parser.FXHParser;

/**
 * Created by tony on 2019-05-28.
 */
public class Main {

    public static void main(String[] args) {

        DisruptorQueue queue = new DisruptorQueue();

        SpiderEngine engine = SpiderEngine.create();

        engine.addSpider(Spider.create(queue)
                .name("bitcoin")
                .url("https://dncapi.bqiapp.com/api/coin/market_ticker?page=1&pagesize=10&code=bitcoin&token=&webp=1")
                .parser(new FXHParser()))
                .run();
    }
}
