package entidades;

public enum Mensajes {
MENSAJE_PREGUNTA("Ingresar nombre: \n"),
    MENSAJE_IMPRIMIR("Te llamas: ");

private String mensaje ;
    Mensajes(String s) {
        this.mensaje = s;
    }

    public String getMensajes() {
        return mensaje;
    }
}
