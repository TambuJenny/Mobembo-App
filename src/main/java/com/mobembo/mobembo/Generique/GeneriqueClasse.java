package com.mobembo.mobembo.Generique;

import java.time.LocalDateTime;
import java.util.UUID;

public class GeneriqueClasse {
    

    public LocalDateTime PegarDataAtual()
    {
        return LocalDateTime.now();
    }

    public String GerarID()
    {
        return UUID.randomUUID().toString();
    }
}
