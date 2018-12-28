package com.carbite.msgboard.dao;

import com.carbite.msgboard.document.MsgDocument;
import org.bson.types.ObjectId;

import java.util.List;

public interface MsgDAO {
    void saveMsg(MsgDocument msg);

    List<MsgDocument> findAll();

    void deleteById(String id);
}
