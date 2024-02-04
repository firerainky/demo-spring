package com.zky.demospring.domain;

import lombok.Data;

@Data
public class AjaxResponse {
    private boolean isOk;
    private int code; // 200, 400, 500, etc.
    private String message;
    private Object data;    // Request data, usually used for query methods

    private AjaxResponse() {}

    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("Request is successful");
        return ajaxResponse;
    }

    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("Request is successful");
        ajaxResponse.setData(data);
        return ajaxResponse;
    }

    public static AjaxResponse success(String message, Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(data);
        return ajaxResponse;
    }
}
