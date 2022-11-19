
package com.mycompany.tarea3;


import java.util.ArrayList;

class DepositoBebidas{
    private final ArrayList<Bebida> var;
    public DepositoBebidas(){
        var = new ArrayList();
    }
    public void addBebida(Bebida b){
        var.add(b);
    }
    public Bebida getBebida(){
        if(var.size()<1){
            return null;
        }else{ 
            return var.remove(0);
        }
    }
} 
