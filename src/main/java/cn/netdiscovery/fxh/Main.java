package cn.netdiscovery.fxh;

import cn.netdiscovery.core.Spider;
import cn.netdiscovery.core.queue.disruptor.DisruptorQueue;
import cn.netdiscovery.fxh.parser.FXHParser;

/**
 * Created by tony on 2019-05-28.
 */
public class Main {

    public static void main(String[] args) {

        DisruptorQueue queue = new DisruptorQueue();

        Spider.create(queue)
                .name("bitcoin")
                .url("https://www.feixiaohao.com/currencies/bitcoin/")
                .parser(new FXHParser())
                .run();
    }
}
