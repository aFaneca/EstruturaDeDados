/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha5;

import java.util.List;

/**
 *
 * @author Marco
 */
public class Pile{
    public void empty(List l){
        l.clear();
    }
    
    public Object peek(List l){
        return l.get(l.size() - 1);
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
