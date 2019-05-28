package cn.netdiscovery.fxh.parser;

import cn.netdiscovery.core.config.Constant;
import cn.netdiscovery.core.domain.Page;
import cn.netdiscovery.core.parser.Parser;
import cn.netdiscovery.core.utils.SerializableUtils;
import cn.netdiscovery.fxh.domain.response.ExchangeResponse;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by tony on 2019-05-28.
 */
@Slf4j
public class FXHParser implements Parser {

    @Override
    public void process(Page page) {

        String json = page.getField(Constant.RESPONSE_JSON).toString();
        ExchangeResponse response = SerializableUtils.fromJson(json, ExchangeResponse.class);

        List<ExchangeResponse.Exchange> exchanges = response.getData();
        for (ExchangeResponse.Exchange exchange:exchanges) {

            log.info(exchange.getName());
            log.info(exchange.getPair1() +"/" + exchange.getPair2());
            log.info(exchange.getPrice()+"");
            log.info(exchange.getPrice_usd()+"$");
            log.info(exchange.getVol()+"");
            log.info("------------------------");
        }
    }
}