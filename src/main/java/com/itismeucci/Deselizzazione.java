package com.itismeucci;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
public class Deselizzazione {
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
        File fileXml = new File("esempioSerializzazioneXML.xml");
        
        XmlMapper xml = new XmlMapper();
        Classe valueXml = xml.readValue(fileXml, Classe.class);
        System.out.println("Xml: ");
        System.out.println("Numero: "+valueXml.getNumero()); 
        System.out.println("Sezione: "+valueXml.getSezione()); 
        System.out.println("Aula: " + valueXml.getAula());

        File fileJson = new File("esempioSerializzazioneJSON.json");
        ObjectMapper json = new ObjectMapper();
        Classe valueJson = json.readValue(fileJson, Classe.class);
        System.out.println("Json: ");
        System.out.println("Numero: "+valueJson.getNumero()); 
        System.out.println("Sezione: "+valueJson.getSezione()); 
        System.out.println("Aula: " + valueJson.getAula());
    }
}
