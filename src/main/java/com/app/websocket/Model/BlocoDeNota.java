package com.app.websocket.Model;

import com.app.websocket.utils.DateTimeUtil;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Notebook")
public class BlocoDeNota {

    @Id
    private String id;
    private String texto;
    private String remetente;
    private String DataHora = DateTimeUtil.getDateTimeStringZone();



}
