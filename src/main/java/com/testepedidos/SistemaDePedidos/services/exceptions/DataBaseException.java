package com.testepedidos.SistemaDePedidos.services.exceptions;

public class DataBaseException extends RuntimeException {
    private static final long serialVersioUID = 1l;

    public DataBaseException(String msg){
        super(msg);
    }
}
