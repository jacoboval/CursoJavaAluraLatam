package com.aluracursos.screenmatch.excepcion;

public class ErrorEnConversionDeDuracion extends RuntimeException {
    private String mensaje;


    public ErrorEnConversionDeDuracion(String mensajes) {
        this.mensaje = mensajes;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }

}
