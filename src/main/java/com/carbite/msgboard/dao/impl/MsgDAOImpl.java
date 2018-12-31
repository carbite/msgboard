package com.carbite.msgboard.dao.impl;

import com.carbite.msgboard.dao.MsgDAO;
import com.carbite.msgboard.entity.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("MsgDAO")
public class MsgDAOImpl implements MsgDAO
{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveMsg(Msg msg) {
        mongoTemplate.save(msg);
    }

    @Override
    public List<Msg> findAll() {
        return mongoTemplate.findAll(Msg.class);
    }

    @Override
    public void deleteById(String id) {
        Query query=new Query(Criteria.where("id").is(id));
        System.out.println(query);
        mongoTemplate.remove(query,Msg.class);
    }
}
