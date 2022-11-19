
package com.mycompany.tarea3;


public class NoHayBebidaException extends Exception{

    public NoHayBebidaException(String message) {
        super(message);
    }   
}
public class PagoIncorrectoException extends Exception{

    public PagoIncorrectoException(String message) {
        super(message);
    }
}
public class PagoInsuficienteException extends Exception {

    public PagoInsuficienteException(String message) {
        super(message);
    }
}
