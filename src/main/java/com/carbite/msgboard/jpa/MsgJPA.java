package com.carbite.msgboard.jpa;

import com.carbite.msgboard.document.MsgDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MsgJPA extends MongoRepository<MsgDocument,String>{
}
