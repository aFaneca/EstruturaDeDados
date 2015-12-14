/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.preparacao_segunda_freq;

/**
 *
 * @author Marco
 */
public class Pessoa{
    String nome;
    String morada;
    Integer nif;

    public Pessoa(String nome, String morada, Integer nif){
        this.nome = nome;
        this.morada = morada;
        this.nif = nif;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMorada(){
        return morada;
    }

    public void setMorada(String morada){
        this.morada = morada;
    }

    public Integer getNif(){
        return nif;
    }

    public void setNif(Integer nif){
        this.nif = nif;
    }
}
