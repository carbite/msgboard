package com.carbite.msgboard.dao;

import com.carbite.msgboard.document.MsgDocument;
import org.bson.types.ObjectId;

import java.util.List;

public interface MsgDAO
{

    public void saveMsg(MsgDocument msg);
    public List<MsgDocument> findAll();
    public void deleteById(ObjectId id);
}
