package cn.netdiscovery.fxh.domain.response;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by tony on 2019-05-28.
 */
@Data
public class HttpResponse<T> implements Serializable {

    private static final long serialVersionUID = -2380590440348557129L;

    private String msg;
    private int code;
    private T data;
    private int currpage;
    private int maxpage;
}
