/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.preparacao_segunda_freq;

import java.util.*;

/**
 *
 * @author Marco
 */
public class Registo{
    List<Pessoa> pessoas;
    HashMap<String, List<Pessoa>> nomes;
    HashMap<String, List<Pessoa>> moradas;
    HashMap<Integer, Pessoa> nif;
    
    public Registo(){
        pessoas = new ArrayList<>();
        nomes = new LinkedHashMap<>();
        moradas = new LinkedHashMap<>();
        nif = new LinkedHashMap<>();
    }
    
    // Adiciona uma pessoa nova à lista pessoas se o nif não existir (NIF é único)
    public void add(Pessoa p){
        if(getPessoa(p.getNif()) == null){
            pessoas.add(p);
            nomes.put(p.getNome(), pessoas);
            moradas.put(p.getMorada(), pessoas);
            nif.put(p.getNif(), p);
        }
    }
    
    // Se encontrar pessoa a partir do nif retorna a pessoa, senão, retorna null
    public Pessoa getPessoa(Integer nif){
        return this.nif.get(nif);
    }
    
    // Procura as pessoas que vivem na morada tal e adiciona a uma nova lista, que vai retornar no final
    public List<Pessoa> getPessoasEm(String morada){
        return moradas.get(morada);
    }
    
    // Procura as pessoas que se chamem nome tal e adiciona a uma nova lista, que vai retornar no final
    public List<Pessoa> getPessoasChamadas(String nome){
       return nomes.get(nome);
    }
}
