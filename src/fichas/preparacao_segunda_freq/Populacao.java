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
public class Populacao{
    Queue<Pessoa> pqPessoas;

    public Populacao(){
        pqPessoas = new PriorityQueue<>();
    }
    
    public void add(Pessoa p){
        pqPessoas.offer(p);
    }
    
    public Pessoa removePessoa(){
        return pqPessoas.poll();
    }
}
