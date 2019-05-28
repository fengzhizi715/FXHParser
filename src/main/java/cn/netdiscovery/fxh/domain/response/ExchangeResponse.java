package cn.netdiscovery.fxh.domain.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by tony on 2019-05-28.
 */
public class ExchangeResponse extends HttpResponse<List<ExchangeResponse.Exchange>> {

    @Data
    public static class Exchange implements Serializable {

        private String name;
        private String pair1;
        private String pair2;
        private double price;
        private double vol;
        private double price_usd;
    }
}
