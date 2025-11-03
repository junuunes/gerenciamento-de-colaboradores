package br.edu.gerenciamentoColaboradores.models;

public class Endereco {
    private String rua;
    private String complemento;
    private String bairro;
    //private para não alterar diretamente.


    public Endereco(String bairro, String complemento, String rua) {
        this.bairro = bairro;
        this.complemento = complemento;
        this.rua = rua;
    }
    //para poder iniciar o objeto endereço.

    public Endereco() {
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;

    }

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }

}
