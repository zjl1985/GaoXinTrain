package com.gaoxin.gaoxintrain.business;

import com.gaoxin.gaoxintrain.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by zhang on 2017/2/16.
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
