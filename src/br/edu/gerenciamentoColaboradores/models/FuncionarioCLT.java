package br.edu.gerenciamentoColaboradores.models;

public abstract class FuncionarioCLT {
    protected String nome;
    protected String documento;
    protected Double  valorSalario;
    protected Endereco endereco;
    //composição: pegar uma classe e colocar uma dentro da outra


    public FuncionarioCLT() {
    }

    public FuncionarioCLT(String documento, Endereco endereco, String nome, Double valorSalario) {
        this.documento = documento;
        this.endereco = endereco;
        this.nome = nome;
        this.valorSalario = valorSalario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }
}
