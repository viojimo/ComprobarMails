public class CompruebaMail {
    Manejador inicial;

    public CompruebaMail() {
        Manejador tecnica=new ManejadorTecnica();
        Manejador comercial=new ManejadorComercial();
        Manejador spam=new ManejadorSpam();

        this.inicial = new ManejadorGerencia();

        inicial.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(tecnica);
        tecnica.setSiguienteManejador(spam);
    }
    public void comprobar(Mail mail){
        inicial.comprobar(mail);
    }
}
