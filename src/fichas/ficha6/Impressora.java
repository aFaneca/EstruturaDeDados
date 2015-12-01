/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichas.ficha6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Jiwe
 */
public class Impressora{
    Map<String, String> informacao;

    public Impressora(String nome, String port, String brand, String model, String driver, String versao){
        informacao = new HashMap<>();
        informacao.put("nome", nome);
        informacao.put("port", port);
        informacao.put("brand", brand);
        informacao.put("model", model);
        informacao.put("driver", driver);
        informacao.put("versao", versao);
    }
    
    public Map getImpressora(String nome){
        if(informacao.get("nome").equals(nome))
            return informacao;
        else
            return null;
    }
}
