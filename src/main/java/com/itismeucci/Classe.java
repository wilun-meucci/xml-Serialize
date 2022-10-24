package com.itismeucci;

import java.util.ArrayList;

public class Classe {
    private int numero;
    private String sezione;
    private String aula;
    public ArrayList<Alunni> alunno;
    public Classe() {
    }
    
    public Classe(int numero, String sezione, String aula, ArrayList<Alunni> alunno) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.alunno = alunno;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getSezione() {
        return sezione;
    }
    public void setSezione(String sezione) {
        this.sezione = sezione;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    public ArrayList<Alunni> getAlunno() {
        return alunno;
    }
    public void setAlunno(ArrayList<Alunni> alunno) {
        this.alunno = alunno;
    }

}
