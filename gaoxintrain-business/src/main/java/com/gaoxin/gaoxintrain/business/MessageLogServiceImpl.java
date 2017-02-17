package com.gaoxin.gaoxintrain.business;

import com.gaoxin.gaoxintrain.api.MessageLog;
import com.gaoxin.gaoxintrain.api.MessageLogService;
import com.gaoxin.gaoxintrain.dao.MessageLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhang on 2017/2/17.
 */
@Service
public class MessageLogServiceImpl implements MessageLogService{
    @Autowired
    private MessageLogMapper messageLogMapper;
    /**
     * 添加方法
     *
     * @param messageLog 实体类
     */
    @Override
    public void insert(MessageLog messageLog) {
        messageLogMapper.insert(messageLog);
    }

    @Override
    public void update(MessageLog messageLog) {
        messageLogMapper.update(messageLog);
    }

    @Override
    public void delete(int id) {
        messageLogMapper.delete(id);
    }

    @Override
    public List<MessageLog> getAll() {
        List<MessageLog>  messageLogList=new ArrayList<>();
        messageLogList=messageLogMapper.getAll();
        return  messageLogList;
    }
}
