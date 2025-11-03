package br.edu.gerenciamentoColaboradores.models;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String documento, Endereco endereco, String nome, Double valorSalario) {
        super(documento, endereco, nome, valorSalario);
        //esse construtor vem da Super Classe.
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "documento='" + documento + '\'' +
                ", endereco=" + endereco.getRua() +
                //é possível pegar apenas um atributo desse objeto através do get
                ", nome='" + nome + '\'' +
                ", valorSalario=" + valorSalario +
                '}';
    }
}
