package com.app.websocket.Repository;

import com.app.websocket.Model.BlocoDeNota;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface BlocoDeNotaRepository extends MongoRepository<BlocoDeNota , String> , BlocoDeNotaRepositoryCustom{


}
