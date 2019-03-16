package com.zhaosw.pattern.strategy.pay;

/**
 * Created by zhaoshuwang on 2019-03-16 0016.
 */
public class MsgResult {
    private int code;
    private String msg;
    private Object data;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "MsgResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
