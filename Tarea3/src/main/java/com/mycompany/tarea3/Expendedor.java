
package com.mycompany.tarea3;

class Expendedor{
    private DepositoBebidas coca;
    private DepositoBebidas sprite;
    private DepositoBebidas fanta;
    private DepositoMonedas DepoMonedas; 
    private int precioBebidas;
    public Expendedor(int cantidad,int precio){ 
        DepoMonedas = new DepositoMonedas();
        precioBebidas = precio;
        int numsc = 100;
        int numss = 200;
        int numsf = 300;
        coca = new DepositoBebidas();
        sprite = new DepositoBebidas();
        fanta = new DepositoBebidas();
        for(int i=0;i<cantidad;i=i+1){
            coca.addBebida(new CocaCola(numsc));
            numsc = numsc+1;
            sprite.addBebida(new Sprite(numss));
            numss = numss+1;
            fanta.addBebida(new Fanta(numsf));
            numsf = numsf+1;
        }
       
    public Bebida comprarBebida(Moneda a,int selec){
        switch (selec) {
            case 1 -> {
                return coca.getBebida();
            }
            case 2 -> {
                return sprite.getBebida();
            }
            case 3 -> {
                return fanta.getBebida();
            }
            default -> {
                return null;
            }
        }
    }
    public void setDeposito(Moneda m){
        int valorVuelto = m.getValor() - precioBebidas;
        for(int i=0;i<valorVuelto/100;i=i+1){
            Moneda monedaTemp = new Moneda100();
            DepoMonedas.addMoneda(monedaTemp);
        }
    }
    public Moneda getVuelto(){
        if(DepoMonedas.size()>0){
            return DepoMonedas.getMoneda();
        }else 
            return null;
    } 
}
