/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fichas.ficha2;

/**
 *
 * @author Jiwe
 */
public class Ex4{
    public static int[] binarySearch(int a[], int value){
        boolean found = false;
        int b = 0, h = a.length - 1;
        int[] r = new int[2];
        
        r[0] = 0;
        r[1] = -1;
        
        while(b <= h){
            int half = (b + h) / 2;
            
            if(a[half] > value)
                h = half - 1;
            else{
                if(a[half] < value)
                    b = half + 1;
                else{
                    r[0] = 1;
                    r[1] = half;
                    return r;
                }
            }
        }
        
        return r;
    }
    
    public static void main(String[] args){
        int[] a = {0, 1, 2, 3, 4, 5, 6};
        
        boolean exists;
        int pos= binarySearch(a, 6)[1];
        
        if(binarySearch(a, 6)[0] == 0)
            exists = false;
        else
            exists = true;
        
        System.out.println("Does it exist? " + exists + " Pos: " + pos);
    }
}
