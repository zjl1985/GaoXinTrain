package com.gaoxin.gaoxintrain.api;

import java.util.List;

/**
 * Created by zhang on 2017/2/17.
 */
public interface MessageLogService {
    /**
     * 添加方法
     * @param messageLog 实体类
     */
    void insert(MessageLog messageLog);
    void update(MessageLog messageLog);
    void delete(int id);
    List<MessageLog> getAll();
}
