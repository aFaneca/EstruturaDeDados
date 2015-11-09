/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ficha.pkg4;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class EDFicha4{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        DezReais reais = new DezReais();
        DezReaisMutavel reaisMutavel = new DezReaisMutavel();
        
        // Elements added for testing class DezReais
        reais.add(-12.0); reais.add(2.0); reais.add(3.0); reais.add(-6.0); reais.add(5.0);
        reais.add(6.0); reais.add(7.0); reais.add(-24.0); reais.add(9.0); reais.add(10.0);
        
        // Elements added for testing class DezReaisMutavel
        reaisMutavel.add(-32.0); reaisMutavel.add(21.0); reaisMutavel.add(32.0); reaisMutavel.add(-6.0); reaisMutavel.add(5.0);
        reaisMutavel.add(8.0); reaisMutavel.add(7.0); reaisMutavel.add(-17.0); reaisMutavel.add(9.0); reaisMutavel.add(18.0);
        
        // New for loop to test iterador
        for(Double element : reais){
            // Test for element removal
            // reais.iterator().remove();
            System.out.println("Element: " + element);
        }
        
        System.out.println("\nBiggest element found <DezReais>: " + findBiggestNumberNonGeneric(reais.numeros));
        System.out.println("Biggest element found <DezReaisMutavel>: " + findBiggestNumberGeneric(reaisMutavel.numeros));
    }
    
    // Non generic function to find biggest number
    public static Double findBiggestNumberNonGeneric(ArrayList<Double> reais){
        Double biggestElement = 0.0;
        
        for(Double element : reais){
            biggestElement = (element > biggestElement) ? element : biggestElement;
        }
        
        return biggestElement;
    }
    
    // Generic function to find biggest number
    public static <T extends Comparable<T>> T findBiggestNumberGeneric(ArrayList<T> elements){
        T biggestElement = elements.get(0);
        
        for(T element : elements){
            if(element.compareTo(biggestElement) > 0){
                biggestElement = element;
            }
        }
        
        return biggestElement;
    }
}
