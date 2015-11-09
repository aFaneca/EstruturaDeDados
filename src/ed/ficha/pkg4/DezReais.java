/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ficha.pkg4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marco
 */
public class DezReais implements Iterable<Double>{
    ArrayList<Double> numeros;
    int contador;
    
    DezReais(){
        numeros = new ArrayList<>();
        contador = 0;
    }
    
    void add(Double novoNumero){
        if(numeros.size() == 10)
            throw new RuntimeException("Maximum elements in array is 10.");
        else
            numeros.add(novoNumero);
    }

    @Override
    public Iterator<Double> iterator(){
        return new DezReaisIterator(this);
    }
}