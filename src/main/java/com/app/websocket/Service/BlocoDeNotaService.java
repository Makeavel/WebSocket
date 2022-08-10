package com.app.websocket.Service;

import com.app.websocket.Model.BlocoDeNota;

import java.util.List;


public interface BlocoDeNotaService {

    BlocoDeNota criaRegistro(BlocoDeNota texto);

    List<BlocoDeNota> leRegistro();

    BlocoDeNota lerRemetente(String remetente) throws Exception;

}
