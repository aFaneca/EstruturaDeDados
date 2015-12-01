/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jiwe
 */
public class GestorImpressoras{
    List<Impressora> impressoras;
    
    public GestorImpressoras(){
        impressoras = new ArrayList<>();
    }
    
    public List<String> getNomesImpressoras(){
        List<String> nomesImpressoras = new ArrayList<>();
        
        for(Impressora i : impressoras)
            nomesImpressoras.add(i.informacao.get("nome"));
        
        return nomesImpressoras;
    }
}
