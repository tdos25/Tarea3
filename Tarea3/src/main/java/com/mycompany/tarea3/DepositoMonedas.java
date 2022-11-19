
package com.mycompany.tarea3;

import java.util.ArrayList;

class DepositoMonedas{
    private final ArrayList<Moneda> var;
    public DepositoMonedas(){
        var = new ArrayList();
    }
    public void addMoneda(Moneda b){
        var.add(b);
    }
    public Moneda getMoneda(){
        if(var.size()<1){
            return null;
        }else{ 
            return var.remove(0);
        }
    }
    public int size(){
        return var.size();
    } 
}
    

