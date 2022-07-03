package com.mobembo.mobembo.Generique;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Hashtable;
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
    public String GerarCodigoViagem()
    {
        String cod = UUID.randomUUID().toString();
        cod = cod.substring(0, 10);

        return "#"+cod;
    }
    
    public List<String> RetornarProvincias()
    {
        String [] todasProvincia = {"Bengo","Benguela","Bié","Cabinda","Cuando-Cubango","Cunene","Huambo","Huíla","Kwanza Sul","Kwanza Norte","Luanda","Lunda Norte","Lunda Sul","Malanje","Moxico","Namibe","Uíge","Zaire"};
        List<String> provinica = new ArrayList<String>();

       for (int i = 0; i < todasProvincia.length; i ++) 
          provinica.add(todasProvincia[i]);

       return provinica;
    }

    public String RetornarMes( String mes)
    {
        Hashtable<String, String> meses = new Hashtable<String, String>();
        meses.put("JANEIRO", "JANUARY");
        meses.put("FEVEREIRO", "FEBRUARY");
        meses.put("MARÇO", "MARCH");
        meses.put("ABRIL", "APRIL");
        meses.put("MAIO", "MAY");
        meses.put("JUNHO", "JUNE");
        meses.put("JULHO", "JULY");
        meses.put("AGOSTO","AUGUST");
        meses.put("SETEMBRO", "SEPTEMBER");
        meses.put("OUTUBRO", "OCTOBER");
        meses.put("NOVEMBRO", "NOVEMBER");
        meses.put("DEZEMBRO", "DECEMBER");

        return meses.get(mes);
    }
   
}
