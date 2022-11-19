
package com.mycompany.tarea3;


    abstract class Bebida{
    private final int serie;
    public Bebida(int numSerie){
        serie = numSerie;
    }
    public int getSerie(){
        return serie;
    }
    @Override 
    public String toString(){
        return "sabor: ";
        }     
    }

class CocaCola extends Bebida{
    public CocaCola(int numSerie){
        super(numSerie);
    }
    @Override
    public String toString(){
        return super.toString() + "cocacola";
    }
}
class Sprite extends Bebida{
    public Sprite(int numSerie){
        super(numSerie);
    }
    @Override
    public String toString(){
        return super.toString() + "sprite";
    }
}
class Fanta extends Bebida{
    public Fanta(int numSerie){
        super(numSerie);
    }
    @Override
    public String toString(){
        return super.toString() + "fanta";
    }
} 
