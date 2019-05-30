package cn.netdiscovery.fxh.domain;

import cn.netdiscovery.fxh.domain.response.ExchangeResponse;
import lombok.Data;

import java.util.List;

/**
 * Created by tony on 2019-05-30.
 */
@Data
public class CoinResult {

    private String coinName;
    private List<ExchangeResponse.Exchange> exchanges;
}
