package br.com.allanborges;

/**
 * Classe User
 * @author Allan-PC
 */
public class User {
    /**
     * propriedade da classe user
     */
    private Integer codigo;
    private String nome;
    private String email;
    private String cargo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     *
     * Metodo Imprime dados do cliente
     *
     */
    public void dadosCliente(){
        System.out.println("\n"+"--------------"+ "\n" + "Dados referente ao Usuario" + "\n" + "----------------" + "\n" +
                this.codigo + "\n" + this.nome + "\n"+ this.email + "\n" + this.cargo + "\n");
    }
}
