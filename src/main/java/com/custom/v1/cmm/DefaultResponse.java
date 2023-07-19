package com.custom.v1.cmm;

import org.springframework.http.HttpStatus;

public class DefaultResponse {

    private final int code;
    private final String message;
    private final Object data;

    public DefaultResponse(HttpStatus status) {
        this.code = status.value();
        this.message = status.name();
        this.data = null;
    }

    public DefaultResponse(HttpStatus status, Object data) {
        this.code = status.value();
        this.message = status.name();
        this.data = data;
    }

    public DefaultResponse(Object code, Object data) {
        this.code = (int) code;
        this.message = "";
        this.data = data;
    }

    public DefaultResponse(Object code, String msg, Object data) {
        this.code = (int) code;
        this.message = msg;
        this.data = data;
    }

    public DefaultResponse(Object data) {
        this.code = -1;
        this.message = "";
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
