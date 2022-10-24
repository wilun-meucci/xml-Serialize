package com.itismeucci;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        XmlMapper xml = new XmlMapper();
        ObjectMapper json = new ObjectMapper();

        Alunni a1 = new Alunni();
        a1.setCognome("wilun"); 
        a1.setNome("dawid");
        a1.setData("24/11/2002");

        Alunni a2= new Alunni();
        a2.setCognome("diCarlo"); 
        a2.setNome("leonardo");
        a2.setData("10/09/2004");

        Alunni a3 = new Alunni();
        a3.setCognome("batistini"); 
        a3.setNome("niccolo");
        a3.setData("30/06/2004");

        ArrayList <Alunni> alunni = new ArrayList<>();
        alunni.add(a1);
        alunni.add(a2);
        alunni.add(a3);

        Classe c1 = new Classe();
        c1.setNumero(5);
        c1.setSezione("Cia");
        c1.setAula("04-TC");
        c1.setAlunno(alunni);

        xml.writeValue(new File("esempioSerializzazioneXML.xml"), c1);
        json.writeValue(new File("esempioSerializzazioneJSON.json"), c1);
    }
}
