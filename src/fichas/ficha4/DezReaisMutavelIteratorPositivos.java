/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Marco
 */
public class DezReaisMutavelIteratorPositivos extends DezReaisMutavel implements Iterator<Double>{
    DezReaisMutavel reais;
    
    // Not sure if correct way to throw exception
    public DezReaisMutavelIteratorPositivos(DezReaisMutavel reais) throws ConcurrentModificationException{
        this.reais = reais;
    }
    
    @Override
    public boolean hasNext(){
        return reais.contador < reais.numeros.size();
    }

    // Recursive function to find every positive value
    @Override
    public Double next(){
        if(this.hasNext()){
            if(reais.numeros.get(reais.contador) > 0)
                return reais.numeros.get(reais.contador++);
            else{
                reais.contador++;
                return next();
            }
        }
        
        throw new NoSuchElementException();
    }

    // Not sure if correct way to throw exception
    @Override
    public void remove() throws IllegalStateException{
        System.out.println("Removing Position <" + (reais.contador) + ">" + " - Containing Element: <" + reais.numeros.get(reais.contador) + ">");
    }
    
}
