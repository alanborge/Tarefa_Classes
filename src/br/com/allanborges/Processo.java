package br.com.allanborges;

/**
 * Classe Processo
 * @author alanborges
 */
public class Processo {

    /**
     * as propriedades da Classe
     *
     */
    private Document document;
    private User user;

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * metodo depreciado
     *
     * @deprecated
     * @hidden
     *
     * See the <a href="{@docRoot}/copyright.html">Copyright</a>.
     */
    public void dadosDoUsuarioNoDocumento(){
        User us = new User();
        us.setCodigo(102034);
        us.getCodigo();
        us.setNome("Alan_Borges_De_Menezes");
        us.getNome();
        us.setEmail("alanborges2020@outlook.com");
        us.getEmail();
        us.setCargo("Gerente_Administrativo");
        us.getCargo();
        System.out.println("Dados do usuario no documento/ PROCESSO" + "\n" +
                           us.getCodigo() + " | " +
                           us.getNome() + " | " +
                          us.getEmail() +  " | "  + us.getCargo() + "\n");
    }
}
