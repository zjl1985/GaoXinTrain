package com.gaoxin.gaoxintrain.controller;

import com.gaoxin.gaoxintrain.api.Demo1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhang on 2017/2/17.
 */
@Controller
@RequestMapping("/demo1")
public class Demo1Controller {

    @RequestMapping(value = "demo1",method = RequestMethod.GET)
    @ResponseBody
    public List<Demo1> getlist() {
        List<Demo1> messageLogList=new ArrayList<>();
        Demo1 messageLog=new Demo1();
        messageLog.setName("dome1");
        messageLog.setAddress("dome1");
        messageLog.setContext("dome1");
        messageLog.setId(1);
        messageLog.setState(1);
        messageLog.setSendTime(new Date());
        messageLogList.add(messageLog);
        return messageLogList;
    }
}
