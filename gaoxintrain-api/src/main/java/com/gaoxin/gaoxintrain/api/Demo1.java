package com.gaoxin.gaoxintrain.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zhang on 2017/2/16.
 */
public class Demo1 implements Serializable{
    private Integer id;
    private String address;
    private String name;
    private String context;
    private Integer state;
    private Date sendTime;

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
