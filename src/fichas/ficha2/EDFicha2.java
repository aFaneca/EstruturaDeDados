/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fichas.ficha2;

import java.util.*;

/**
 *
 * @author Jiwe
 */
public class EDFicha2{
    public static int generateRandom(int max, int min){
        return new Random().nextInt((max - min) + 1);
    }
    
    public static int [] criaArrayCom(int valor, int dimensao, boolean diferentes){
        int [] array;
        int tmp, max, min = 0;
        boolean temValor = false;
        
        if(valor > dimensao)
            max = valor;
        else
            max = dimensao;
        
        if(diferentes == true){
            array = new Random().ints(min, max).distinct().limit(max).toArray();
            
            for(int i = 0; i < dimensao; i++){
                for(int j = 0; j < dimensao; j++){
                    if(array[j] > array[i]){
                        tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                    }
                }
            }
        }
        else{
            array = new Random().ints(min, max).limit(max).toArray();
            
            for(int i = 0; i < dimensao; i++){
                for(int j = 0; j < dimensao; j++){
                    if(array[j] > array[i]){
                        tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                    }
                }
            }
        }
        
        for(int i = 0; i < dimensao; i++){
            if(array[i] == valor)
                temValor = true;
        }
        
        if(temValor == false){
            for(int i = 0; i < dimensao; i++){
                if(array[i] > valor){
                    array[i] = valor;
                    i = dimensao;
                }
            }
        }
        
        return array;
    }
    
    public static int [] criaArraySem(int valor, int dimensao, boolean diferentes){
        int [] array;
        int tmp, max, min = 0;
        boolean temValor = false;
        
        if(valor > dimensao)
            max = valor;
        else
            max = dimensao;
        
        if(diferentes == true){
            array = new Random().ints(min, max).distinct().limit(max).toArray();
            
            for(int i = 0; i < dimensao; i++){
                for(int j = 0; j < dimensao; j++){
                    if(array[j] > array[i]){
                        tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                    }
                }
            }
        }
        else{
            array = new Random().ints(min, max).limit(max).toArray();
            
            for(int i = 0; i < dimensao; i++){
                for(int j = 0; j < dimensao; j++){
                    if(array[j] > array[i]){
                        tmp = array[j];
                        array[j] = array[i];
                        array[i] = tmp;
                    }
                }
            }
        }
        
        for(int i = 0; i < dimensao; i++){
            if(array[i] == valor)
                temValor = true;
        }
        
        if(temValor == true){
            for(int i = 0; i < dimensao; i++){
                if(array[i] == valor){
                    array[i] = array[i] + 1;
                    i = dimensao;
                }
            }
        }
        
        return array;
    }
    
    public static void main(String[] args){
        int valor = 6, dimensao = 10;
        boolean diferentes = true;
        int [] array = criaArrayCom(valor, dimensao, diferentes);
        
        for(int i = 0; i < dimensao; i++){
            System.out.println("Nr " + i + ": " + array[i] + "\n");
        }
    }
}
