public class ManejadorGerencia extends Manejador{


    @Override
    public void comprobar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("gerencia@colmena.com"))||(mail.getTema().equalsIgnoreCase("gerencia")))
        {
            System.out.println("Enviamos a gerencia");
        }
        else
        {
            if (this.getSiguienteManejador()!=null){
                this.getSiguienteManejador().comprobar(mail);
            }
        }

    }
}
