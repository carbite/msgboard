package com.carbite.msgboard.service.impl;

import com.carbite.msgboard.dao.MsgDAO;
import com.carbite.msgboard.entity.Msg;
import com.carbite.msgboard.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgServiceImpl implements MsgService {

    @Autowired
    private MsgDAO msgDAO;

    @Override
    public void addMsg(Msg msg) {
        msgDAO.saveMsg(msg);
    }

    @Override
    public void deleteMsg(String Id) {
        msgDAO.deleteById(Id);
    }

    @Override
    public List<Msg> findAllMsg() {
        return msgDAO.findAll();
    }
}
