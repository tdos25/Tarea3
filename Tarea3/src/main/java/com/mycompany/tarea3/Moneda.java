
package com.mycompany.tarea3;

abstract class Moneda{
    public Moneda(){
    }
    public String getSerie(){
        String s = Integer.toString(System.out.hashCode());
        return s;
    }
    public abstract int getValor();
} 
class Moneda100 extends Moneda{
    @Override
    public int getValor(){
        return 100;
    }
}
class Moneda500 extends Moneda{
    @Override
    public int getValor(){
        return 500;
    }
}
class Moneda1000 extends Moneda{
    @Override
    public int getValor(){
        return 1000;
    }
}