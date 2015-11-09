/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ficha.pkg5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Marco
 */
public class EDFicha5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList(new String[10]));
        
        // Example of an array filling and printing
        FillCollection(list, "ED");
        
        list.set(0, "TEST - 0");
        list.set(3, "TEST - 3");
        
        System.out.println("Normal: \n");
        for(String s : list)
            System.out.println(s);
        
        // Reverse list and iterate over it with a ListIterator
        Collections.reverse(list);
        ListIterator li = list.listIterator();
        
        System.out.println("\nReversed: \n");
        while(li.hasNext())
            System.out.println(li.next());
        
        // Creating a pile
        Pile pile = new Pile();
        
        pile.push(list, "DERPY DURPO");
        pile.print(list);
    }
    
    public static <T> void FillCollection(List<T> l, T value){
        for(int i = 0; i < l.size(); i++){
            l.set(i, value);
        }
    }
}
