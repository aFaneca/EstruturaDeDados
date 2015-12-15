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
public class Cidade{
    static public Integer getPopulacao(String nome){
        switch(nome){
            case "Coimbra":
                return 150000;
            case "Lisboa":
                return 550000;
            default:
                return 0;
        }
    }
}
