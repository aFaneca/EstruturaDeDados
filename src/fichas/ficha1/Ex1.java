/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha1;

/**
 *
 * @author Jiwe
 */
public class Ex1 {
    static long startTime, stopTime;
    
    static void start(){
        startTime = System.nanoTime();
    }
    
    static void stop(){
        stopTime = System.nanoTime();
    }
    
    static long getElapsed(){
        return stopTime - startTime;
    }
    
    static void ela(int n){
        start();
        int soma = 0;
        for(int i = 0; i < n; i++)
            soma++;
        stop();
        System.out.println("N = " + soma);
    }
    
    static void ele(long n){
        start();
        int soma = 0;
        for(long i = 0; i < n; i++)
            soma++;
        stop();
        System.out.println("N = " + soma);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ele(10000);
        System.out.println("Elapsed = " + getElapsed() / 1000000.0);
    }
}
