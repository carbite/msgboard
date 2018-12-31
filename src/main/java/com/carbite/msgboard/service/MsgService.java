package com.carbite.msgboard.service;

import com.carbite.msgboard.entity.Msg;

import java.util.List;

public interface MsgService
{
    public void addMsg(Msg msg);
    public void deleteMsg(String Id);
    public List<Msg> findAllMsg();
}
