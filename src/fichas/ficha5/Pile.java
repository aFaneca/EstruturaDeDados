/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha5;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Marco
 */
public class Pile{
    public void empty(List l){
        l = Collections.emptyList();
    }
    
    public Object peek(List l){
        ListIterator li = l.listIterator();
        
        if(li.hasNext())
            return li.next();
        else
            return null;
    }
    
    public void pop(List l){
        l.remove(0);
    }
    
    public void push(List l, Object value){
        l.add(0, value);
    }
    
    public void print(List l){
        System.out.println("\nPile: \n");
        
        for(Object o : l){
            System.out.println("Pile: " + o);
        }
    }
}
