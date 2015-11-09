/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fichas.ficha3;

/**
 *
 * @author Jiwe
 */
public class Ficha3{
    public static <T> boolean searchGenericArray(T a[], T e){
        int count = 0;
        
        for(T i : a){
            if(i == e)
                count++;
            
            if(count == 2)
                return true;
        }
        
        return false;
    }
    
    public static <T extends Comparable<T>> boolean comparableSearchGenericArray(T a[], T e){
        int count = 0;
        
        for(T i : a){
            if(i.compareTo(e) == 0)
                count++;
            
            if(count == 2)
                return true;
        }
        
        return false;
    }
    
    public static void main(String[] args){
        Integer element = 5, element2 = 1;
        Integer[] myList = {1, 2, 3, 4, 5, 6, 5};
        Figura rect = new Rectangulo(5, 5);
        
        System.out.println("Elemento " + element + " existe mais do que uma vez?: " + searchGenericArray(myList, element));
        System.out.println("Elemento " + element + " existe mais do que uma vez?: " + comparableSearchGenericArray(myList, element2));
        System.out.println("Área da Figura é igual: " + rect.compareTo(new Rectangulo(5, 5)));
    }
}
