public class Test {
    public static void main(String[] args) {
        CompruebaMail proceso = new CompruebaMail();
        proceso.comprobar(new Mail("fran@mail.com","tecnica@colmena.com","reclamo"));
        proceso.comprobar(new Mail("fran@mail.com","sara@colmena.com","hola"));
        proceso.comprobar(new Mail("fran@mail.com","comercial@colmena.com","disenio"));

    }
}
