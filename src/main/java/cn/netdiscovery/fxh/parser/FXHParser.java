package cn.netdiscovery.fxh.parser;

import cn.netdiscovery.core.domain.Page;
import cn.netdiscovery.core.domain.ResultItems;
import cn.netdiscovery.core.parser.Parser;
import cn.netdiscovery.core.parser.selector.Selectable;
import cn.netdiscovery.fxh.domain.Exchange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 2019-05-28.
 */
public class FXHParser implements Parser {

    @Override
    public void process(Page page) {

//        ResultItems resultItems = page.getResultItems();
//
//        String price = page.getHtml().xpath("//*[@id=\"__layout\"]/section/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/span/span").get();
//        price = price.replace("<span class=\"convert\">","").replace("</span>","");
//        resultItems.put("price",price);
//
//        List<Exchange> exchangeList = new ArrayList<>();
//
//        String list = page.getHtml().xpath("//*[@id=\"__layout\"]/section/div/div/div[1]/div[2]/div/div[2]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[4]/div/span").get();
//
//        System.out.println(list);

        System.out.println(page.getHtml().get());
    }
}