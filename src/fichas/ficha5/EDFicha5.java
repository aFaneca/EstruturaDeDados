/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
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
        List<String> list2 = new LinkedList<>(Arrays.asList(new String[10]));
        
        // Example of an array filling and printing
        FillCollection(list, "ArrayList");
        FillCollection(list2, "LinkedList");
        
        list.set(0, "ArrayList TEST - 0");
        list.set(3, "ArrayList TEST - 3");
        
        list2.set(0, "LinkedList TEST - 0");
        list2.set(3, "LinkedList TEST - 3");
        
        // Only printing variable: list to show
        System.out.println("Normal: \n");
        for(String s : list)
            System.out.println(s);
        
        // Reverse list and iterate over it with a ListIterator
        Collections.reverse(list);
        Collections.reverse(list2);
        
        ListIterator li = list.listIterator();
        
        // Only printing variable: list to show
        System.out.println("\nReversed: \n");
        while(li.hasNext())
            System.out.println(li.next());
        
        // Creating a pile
        Pile pile = new Pile();
        
        /*
        *
        * ARRAY LIST
        *
        */
        System.out.println("\n-> Array Lists <-");
        
        // Add element to beginning of pile and see results
        pile.push(list, "DERPY DURPO");
        pile.print(list);
        
        // Delete element from beginning of pile and see results
        pile.pop(list);
        pile.print(list);
        
        // Peek last element
        System.out.println("\nPeeking: " + pile.peek(list));
        
        // Erase Pile
        pile.empty(list);
        pile.print(list);
        
        /*
        *
        * LINKED LIST
        *
        */
        System.out.println("\n-> Linked Lists <-");
        
        // Add element to beginning of pile and see results
        pile.push(list2, "DERPY DURPO");
        pile.print(list2);
        
        // Delete element from beginning of pile and see results
        pile.pop(list2);
        pile.print(list2);
        
        // Peek last element
        System.out.println("\nPeeking: " + pile.peek(list2));
        
        // Erase Pile
        pile.empty(list2);
        pile.print(list2);
    }
    
    public static <T> void FillCollection(List<T> l, T value){
        for(int i = 0; i < l.size(); i++){
            l.set(i, value);
        }
    }
}
