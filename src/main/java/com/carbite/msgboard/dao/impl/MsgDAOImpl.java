package com.carbite.msgboard.dao.impl;

import com.carbite.msgboard.dao.MsgDAO;
import com.carbite.msgboard.document.MsgDocument;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("MsgDAO")
public class MsgDAOImpl implements MsgDAO
{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveMsg(MsgDocument msg) {
        mongoTemplate.save(msg);
    }

    @Override
    public List<MsgDocument> findAll() {
        return mongoTemplate.findAll(MsgDocument.class);
    }

    @Override
    public void deleteById(ObjectId id) {
        System.out.println(id.toString());
        Query query=new Query(Criteria.where("_id").is(id));
        MsgDocument sss = mongoTemplate.findOne(query,MsgDocument.class);
        System.out.println(query.toString());
        if(sss!=null)
            System.out.println(sss.getName());
        mongoTemplate.remove(query,MsgDocument.class);
    }
}
