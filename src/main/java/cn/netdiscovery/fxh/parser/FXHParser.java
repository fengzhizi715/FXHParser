package cn.netdiscovery.fxh.parser;

import cn.netdiscovery.core.domain.Page;
import cn.netdiscovery.core.domain.ResultItems;
import cn.netdiscovery.core.parser.Parser;

/**
 * Created by tony on 2019-05-28.
 */
public class FXHParser implements Parser {

    @Override
    public void process(Page page) {

        ResultItems resultItems = page.getResultItems();

        String price = page.getHtml().xpath("//*[@id=\"__layout\"]/section/div/div/div[1]/div[1]/div[2]/div[1]/div[1]/span/span").get();
        price = price.replace("<span class=\"convert\">","").replace("</span>","");
        resultItems.put("price",price);
    }
}
