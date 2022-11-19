
package com.mycompany.tarea3;

import java.awt.Color;
import java.awt.Graphics;


    public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana 
    private Comprador com; 
    private Expendedor exp; 
    public PanelPrincipal () { 
        exp = new Expendedor (); 
        cf = new Comprador(); 
        this.setBackground(Color.white); 
    } 
    public void paint (Graphics g) {  //todo se dibuja a partir de este método 
         super.paint(g);  //llama al método pint al que hace override en la super clase 
                          //el de la super clase solo pinta el fondo (background)          
         com.paint(g);    //llama al metodo paint definido en el comprador 
         exp.paint(g);    //llama al metodo paint definido en el expendedor 
    }   
}  
//tanto expendedor como comprador deben definir sus propios métodos paint 
//bebidas y monedas tampien deben definir sus métodos paint 
//desde el paint del expendedor se llama a los paint’s de los depositos 
//los paints de los depósitos llaman a los paint’s de bebidas y monedas; 
//(al agregar o remover algo en un Deposito, se llama setXY de todo lo que contiene)
    
