package com.gaoxin.gaoxintrain.api;

import java.io.Serializable;

/**
 * Created by zhang on 2017/2/16.
 */
public class Hello implements Serializable{
   private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
