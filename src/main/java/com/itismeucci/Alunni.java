package com.itismeucci;

import java.util.*;
public class Alunni {
    private String nome;
    private String data;
    private String cognome;

    
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Alunni(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }
    public Alunni() {
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
   
    
}
