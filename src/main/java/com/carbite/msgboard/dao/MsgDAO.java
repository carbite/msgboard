package com.carbite.msgboard.dao;

import com.carbite.msgboard.entity.Msg;

import java.util.List;

public interface MsgDAO {

    void saveMsg(Msg msg);

    List<Msg> findAll();

    void deleteById(String id);
}
