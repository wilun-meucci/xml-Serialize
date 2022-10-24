package com.itismeucci;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class Deselizzazione {
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        File file = new File("esempioSerializzazione.xml");
        XmlMapper xml = new XmlMapper();
        Classe value = xml.readValue(file, Classe.class);
        System.out.println("Numero: "+value.getNumero()); 
        System.out.println("Sezione: "+value.getSezione()); 
        System.out.println("Aula: " + value.getAula());
     

    }
}
