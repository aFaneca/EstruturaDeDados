/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha6;

import java.util.List;

/**
 *
 * @author Jiwe
 */
public class TestarImpressoras{
    public static void main(String[] args){
        GestorImpressoras gestorImpressoras = new GestorImpressoras();
        
        for(int i = 1; i <= 10; i++){
            gestorImpressoras.impressoras.add(new Impressora("I" + Integer.toString(i*(i^(2+i))), "3000", "HP", "A01", "xpto", "1.40.14"));
        }
        
        for(Object l : gestorImpressoras.getNomesImpressoras())
            System.out.println("Impressora: " + l);
    }
}
