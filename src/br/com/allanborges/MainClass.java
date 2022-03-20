/**
 * os pacotes
 */
package br.com.allanborges;
/**
 * imports da Class
 */

import java.util.Scanner;

/**
 *
 * Classe principal
 * @author Allan-PC
 */
public class MainClass {

    /**
     *
     * @param args metodo da classe principal
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         User user = new User();
         Document dc = new Document();
         Processo pc = new Processo();
        /**
         *
         */
        user.setCodigo(3245);
         user.getCodigo();
         user.setNome("Alan_Borges");
         user.getNome();
         user.setEmail("alan.borges@dataeasy.com.br");
         user.getEmail();
         user.setCargo("Analista_Suporte");
         user.getCargo();


        /**
         * Deve imiprimir os registros do Documento
         */
        System.out.println("Informe o numero do documento");
        dc.getNumero();
        dc.setNumero(input.nextInt());
        System.out.println("Informe o interessado");
        dc.getInteressado();
        dc.setInteressado(input.next());
        System.out.println("Informe o assunto");
        dc.getAssunto();
        dc.setAssunto(input.next());
        System.out.println("Destaque as observações do documento");
        dc.getObservacoes();
        dc.setObservacoes(input.next());

        /**
         * see
         * <ol>
         *     <ul>Metodo que imprime as registros do cliente<ul/>
         *     <ul>Metodo que imprime os registros do documento<ul/>
         *     <ul>Metodo do Processo invalidado<ul/>
         *  <ol/>
         */
        user.dadosCliente();
        dc.imprimirDocumento();
        pc.dadosDoUsuarioNoDocumento();
    }
}
