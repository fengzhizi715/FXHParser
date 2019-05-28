package cn.netdiscovery.fxh.domain;

import lombok.Data;

/**
 * Created by tony on 2019-05-28.
 */
@Data
public class Exchange {

    private String name; // 交易所名称
    private String pair; // 交易对
    private double latestPrice; // 最新价格
}
