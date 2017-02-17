package com.gaoxin.gaoxintrain.controller;

import com.gaoxin.gaoxintrain.api.MessageLog;
import com.gaoxin.gaoxintrain.api.MessageLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhang on 2017/2/17.
 */
@Controller
@RequestMapping("/messagelog")
public class MessageLogController {
    @Autowired
    private MessageLogService messageLogService;

    @RequestMapping(value = "messagelog",method = RequestMethod.GET)
    @ResponseBody
    public List<MessageLog> getAll(){
        List<MessageLog> messageLogList=messageLogService.getAll();
        return messageLogList;
    }
}
