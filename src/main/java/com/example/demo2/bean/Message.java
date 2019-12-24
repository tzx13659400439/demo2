package com.example.demo2.bean;

import java.io.Serializable;

public class Message implements Serializable {
    private int code;
    private String status;

    public Message(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
