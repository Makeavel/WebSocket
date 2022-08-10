package com.app.websocket.Repository;

import com.app.websocket.Model.BlocoDeNota;

import java.util.List;

public interface BlocoDeNotaRepositoryCustom {

    List<BlocoDeNota> findByRemetente(String remetente) ;
}
