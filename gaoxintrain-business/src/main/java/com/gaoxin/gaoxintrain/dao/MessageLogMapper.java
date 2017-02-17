package com.gaoxin.gaoxintrain.dao;

import com.gaoxin.gaoxintrain.api.MessageLog;

import java.util.List;

/**
 * Created by zhang on 2017/2/17.
 */
public interface MessageLogMapper {
    void insert(MessageLog messageLog);
    void update(MessageLog messageLog);
    void delete(int id);
    List<MessageLog> getAll();
}
