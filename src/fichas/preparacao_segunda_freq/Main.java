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
public class Main{
    public static void main(String[] args){
        // Ex 1
        Registo novoRegisto = new Registo();
        
        novoRegisto.add(new Pessoa("Marco", "Coimbra", 123456789));
        
        Pessoa p = novoRegisto.getPessoa(123456789);
        
        System.out.println("My Name: " + p.getNome());
        
        // Ex 2
        Populacao pop = new Populacao();
        
        System.out.println("Nr de Habitantes em Coimbra: " + Cidade.getPopulacao("Coimbra"));
        System.out.println("Nr de Habitantes em Lisboa: " + Cidade.getPopulacao("Lisboa"));
        
        pop.add(new Pessoa("Carlos", "Coimbra", 123456));
        pop.add(new Pessoa("Carlos", "Lisboa", 123456));
        pop.add(new Pessoa("Ana", "Coimbra", 555555));
        
        System.out.println("Pessoa removida: " + pop.removePessoa().getNome());
        System.out.println("Pessoa removida: " + pop.removePessoa().getNome());
        
        // Ex 3
        TreeSet<Integer> tree = new TreeSet<>();
        
        tree.add(1);
        tree.add(20);
        tree.add(5);
        tree.add(400);
        tree.add(240);
        tree.add(500);
        
        System.out.println("Elementos maiores que 100: " + MaioresQue(tree, 23).toString());
        
        RemoveMaioresQue(tree, 5);
        
        System.out.println("Elementos na tree: " + tree);
    }
    
    static <T> Integer MaioresQue(TreeSet<T> tree, T value){
        return tree.tailSet(value).size();
    }
    
    static <T extends Comparable<T>> void RemoveMaioresQue(TreeSet<T> tree, T value){
        while(tree.last().compareTo(value) > 0)
            tree.pollLast();
    }
}
