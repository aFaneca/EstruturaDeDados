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
public class Main{
    public static void main(String[] args){
        Registo novoRegisto = new Registo();
        
        novoRegisto.add(new Pessoa("Marco", "Coimbra", 123456789));
        
        Pessoa p = novoRegisto.getPessoa(123456789);
        
        System.out.println("My Name: " + p.getNome());
    }
}
