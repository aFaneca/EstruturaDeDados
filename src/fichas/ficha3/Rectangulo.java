/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha3;

/**
 *
 * @author Jiwe
 */
public class Rectangulo extends Figura{
    int w;
    int l;

    Rectangulo(int w, int l){
        this.w = w;
        this.l = l;
    }
    
    @Override
    public int myArea(){
        return w * l;
    }
}
