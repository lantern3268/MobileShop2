package com.huatec.edu.mobileshop.http.entity;

import java.io.Serializable;

public class HttpResult<T> implements Serializable {
    private int status;
    private String msg;
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    public  T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "HttpResult{"+
                "data="+ data +
                ",status="+ status +
                ", msg='"+ msg + '\'' +
                '}';
    }
}
