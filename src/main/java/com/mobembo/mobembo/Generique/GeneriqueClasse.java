package com.mobembo.mobembo.Generique;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import java.util.List;


public class GeneriqueClasse {
    

    public LocalDateTime PegarDataAtual()
    {
        return LocalDateTime.now();
    }

    public String GerarID()
    {
         return UUID.randomUUID().toString();
    }
    
    public List<String> RetornarProvincias()
    {
        String [] todasProvincia = {"Bengo","Benguela","Bié","Cabinda","Cuando-Cubango","Cunene","Huambo","Huíla","Kwanza Sul","Kwanza Norte","Luanda","Lunda Norte","Lunda Sul","Malanje","Moxico","Namibe","Uíge","Zaire"};
        List<String> provinica = new ArrayList<String>();

       for (int i = 0; i < todasProvincia.length; i ++) 
          provinica.add(todasProvincia[i]);

       return provinica;
    }

    /*public float CalcularPreço()
    {

    }*/
   
}
