/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ficha.pkg4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;

/**
 *
 * @author Marco
 */
public class DezReaisMutavelIterator extends DezReaisMutavel implements Iterator<Double>{
    DezReaisMutavel reais;
    
    // Not sure if correct way to throw exception
    public DezReaisMutavelIterator(DezReaisMutavel reais) throws ConcurrentModificationException{
        this.reais = reais;
    }
    
    @Override
    public boolean hasNext(){
        return reais.contador < reais.numeros.size();
    }

    @Override
    public Double next(){
        if(this.hasNext())
            return reais.numeros.get(reais.contador++);
        
        throw new NoSuchElementException();
    }

    // Not sure if correct way to throw exception
    @Override
    public void remove() throws IllegalStateException{
        System.out.println("Removing Position <" + (reais.contador) + ">" + " - Containing Element: <" + reais.numeros.get(reais.contador) + ">");
    }
    
}
