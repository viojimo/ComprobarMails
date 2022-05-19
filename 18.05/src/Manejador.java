public abstract class Manejador {
    protected Manejador siguienteManejador;
    //(recursivo)


    public Manejador getSiguienteManejador() {
        return siguienteManejador;
    }

    public void setSiguienteManejador(Manejador siguienteManejador) {
        this.siguienteManejador = siguienteManejador;
    }
    //(no podemos crear constructores de una clase abtracta)

    public abstract void comprobar(Mail mail);
    //¿qué queremos hacer? ""





}
