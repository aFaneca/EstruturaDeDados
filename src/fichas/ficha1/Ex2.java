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
public class Ex2 {
    static boolean search(int n[], int value){
        return search2(n, value, 0, n.length - 1);
    }
    
    static boolean search2(int n[], int value, int lower, int higher){
        if(lower > higher)
            return false;
        
        int half = (lower + higher) / 2;
        
        if(value > n[half])
            return search2(n, value, half + 1, higher);
        else{
            if(value < n[half])
                return search2(n, value, lower, half - 1);
            else
                return true;
        }
    }
    
    public static void main(String[] args) {
        int n[] = new int[]{-500, -430, -371, 5, 10, 15, 27, 54, 86, 1034, 2005, 2765};
        int i = 27;
        
        System.out.println("Valor encontrado: " + search(n, i));
    }
    
}
