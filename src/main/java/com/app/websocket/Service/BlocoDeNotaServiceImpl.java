package com.app.websocket.Service;

import com.app.websocket.Model.BlocoDeNota;
import com.app.websocket.Repository.BlocoDeNotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocoDeNotaServiceImpl implements BlocoDeNotaService {

    @Autowired
    private BlocoDeNotaRepository blocoDeNotaRepository;
    @Autowired
    private SimpMessagingTemplate send;

    private static final String MENSAGEM_ERRO = "Não existe";

    @Override
    public BlocoDeNota criaRegistro(BlocoDeNota blocoDeNota) {
       BlocoDeNota saveBlocoDeNota = blocoDeNotaRepository.save(blocoDeNota);
       send.convertAndSend("/WebSocket", saveBlocoDeNota);
        return saveBlocoDeNota;
    }

    @Override
    public List<BlocoDeNota> leRegistro() {
        return blocoDeNotaRepository.findAll();
    }

    @Override
    public BlocoDeNota lerRemetente(String remetente) {
        return (BlocoDeNota) blocoDeNotaRepository.findByRemetente(remetente);
    }


}
