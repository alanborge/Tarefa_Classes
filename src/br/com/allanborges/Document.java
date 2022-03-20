/**
 *
 */
package br.com.allanborges;

/**
 * Classe Documento
 * @author Allan-PC
 *
 * @version 1.0
 */

public class Document {

    private Integer numero;
    private  String Interessado;
    private String assunto;
    private String observacoes;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getInteressado() {
        return Interessado;
    }

    public void setInteressado(String interessado) {
        Interessado = interessado;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * Metodo que tras dados do documento
     *
     */
    public void imprimirDocumento(){
        System.out.println("----------------" + "\n" + "Registros do Documento" + "\n" + "-----------------" + " \n" +
                 this.numero + "\n" + this.Interessado + "\n" + this.assunto + "\n" + this.observacoes + "\n");
    }
}
