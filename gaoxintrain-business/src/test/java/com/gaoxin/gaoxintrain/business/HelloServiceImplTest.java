package com.gaoxin.gaoxintrain.business;

import com.gaoxin.gaoxintrain.api.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by zhang on 2017/2/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"classpath:sys-root-test.xml"}
)
public class HelloServiceImplTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void showMessage() throws Exception {
        helloService.showMessage("123123");
    }

}