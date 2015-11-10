/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Marco
 */
public class DezReaisIterator extends DezReais implements Iterator<Double>{
    DezReais reais;
    
    public DezReaisIterator(DezReais reais){
        this.reais = reais;
    }
    
    @Override
    public boolean hasNext(){
        return reais.contador < reais.numeros.size();
    }

    @Override
    public Double next(){
        if(this.hasNext()){
            return reais.numeros.get(reais.contador++);
        }
        
        throw new NoSuchElementException();
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }
}
