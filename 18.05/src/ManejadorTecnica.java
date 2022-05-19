public class ManejadorTecnica extends Manejador{
    @Override
    public void comprobar(Mail mail) {
        if ((mail.getDestino().equalsIgnoreCase("tecnica@colmena.com"))||(mail.getTema().equalsIgnoreCase("tecnica")))
        {
            System.out.println("Enviamos a tecnica");
        }
        else
        {
            if (this.getSiguienteManejador()!=null){
                this.getSiguienteManejador().comprobar(mail);
            }
        }
    }
}
