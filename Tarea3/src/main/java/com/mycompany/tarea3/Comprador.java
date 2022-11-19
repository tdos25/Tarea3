
package com.mycompany.tarea3;

public class Comprador{
    private Moneda monedaComprador;
    private int queBebida;
    private int sumatoriaVuelto;
    private String sabor;
    public Comprador(Moneda m, int cualBebida, Expendedor exp){
        monedaComprador = m;
        queBebida = cualBebida;
        sumatoriaVuelto = 0;
    }
    public Moneda getMoneda(){
        return monedaComprador;
    }
    public int getQueBebida(){
        return queBebida;
    }
    public void setSabor(Bebida b){
        sabor = b.toString();
    }
    public void setVuelto(Moneda m){
        if(m!=null){
            sumatoriaVuelto = sumatoriaVuelto + m.getValor();
        }
    }
    public int cuantoVuelto(){
        return sumatoriaVuelto;
    }
    public String queBebiste(){
        return sabor;
    }
   
}

