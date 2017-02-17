package com.gaoxin.gaoxintrain.business;

import com.gaoxin.gaoxintrain.api.MessageLog;
import com.gaoxin.gaoxintrain.api.MessageLogService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.dc.pr.PRError;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/2/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"classpath:sys-root-test.xml"}
)
public class MessageLogServiceImplTest {
    @Autowired
    private MessageLogService messageLogService;

    @Test
    public void getAll() throws Exception {
        List<MessageLog> messageLogList=messageLogService.getAll();
        System.out.println(messageLogList.size());
        Assert.assertEquals(messageLogList.size(),1);
    }


    @Test
    public void insertTest() throws Exception {
        MessageLog messageLog=new MessageLog();
        messageLog.setName("heheda");
        messageLog.setSendTime(new Date());

        messageLogService.insert(messageLog);
    }

}