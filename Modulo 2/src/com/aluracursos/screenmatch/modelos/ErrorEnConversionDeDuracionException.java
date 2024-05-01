package com.aluracursos.screenmatch.modelos;

public class ErrorEnConversionDeDuracionException extends RuntimeException {
    private String mensaje;


    public ErrorEnConversionDeDuracionException(String mensajes) {
        this.mensaje = mensajes;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }

}
