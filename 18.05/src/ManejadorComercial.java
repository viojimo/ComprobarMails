public class ManejadorComercial extends Manejador {

    @Override
    public void comprobar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("comercial@colmena.com"))||(mail.getTema().equalsIgnoreCase("comercial")))
        {
            System.out.println("Enviamos a comercial");
        }
        else
        {
            if (this.getSiguienteManejador()!=null){
                this.getSiguienteManejador().comprobar(mail);
            }
        }





    }
}
