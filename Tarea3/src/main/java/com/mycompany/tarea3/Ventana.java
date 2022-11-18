
package com.mycompany.tarea3;

import javax.swing.JFrame;

public class Ventana extends JFrame {
    public Ventana(){
    this.setSize(1000,600);//tamaño de ventana
    this.setLocationRelativeTo(null);//colocar la ventana en el centro
    this.setVisible(true);// para que la ventana sea visible
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);// para que se deje de ejecutar al presionar la cruz
    this.setTitle("MAQUINA EXPENDENDORA");//titulo

    } 
}
