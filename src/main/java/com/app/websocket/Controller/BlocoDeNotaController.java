package com.app.websocket.Controller;

import com.app.websocket.Model.BlocoDeNota;
import com.app.websocket.Service.BlocoDeNotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/WebSocket")
public class BlocoDeNotaController {

    @Autowired
    private BlocoDeNotaService blocoDeNotaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public BlocoDeNota criaRegistro(@RequestBody BlocoDeNota blocoDeNota){
        return blocoDeNotaService.criaRegistro(blocoDeNota);
    }

    @GetMapping("/read")
    public List<BlocoDeNota> lerRegistros(){
        return blocoDeNotaService.leRegistro();
    }

    @GetMapping("/read/{remetente}")
    public BlocoDeNota lerRegistroRemetente(@PathVariable("remetente") String remetente) throws Exception{
        return blocoDeNotaService.lerRemetente(remetente);
    }

}
