package com.app.websocket.Repository;

import com.app.websocket.Model.BlocoDeNota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class BlocoDeNotaRepositoryCustomImpl implements BlocoDeNotaRepositoryCustom{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<BlocoDeNota> findByRemetente(String remetente) {
        Query query = new Query();
        query.addCriteria(Criteria.where("remetente").is(remetente));
        return mongoTemplate.find(query, BlocoDeNota.class);
    }
}
