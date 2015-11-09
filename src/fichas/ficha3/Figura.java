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
public abstract class Figura implements Comparable<Figura>{
    public abstract int myArea();
    
    @Override
    public int compareTo(Figura o){
        return this.myArea() - o.myArea();
    }
}
