package br.edu.gerenciamentoColaboradores.models;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {
    private Double valorDaBonificacao;

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonificacao = this.valorSalario * (porcentagemBonificacao/100d);
        //pega o salário e multiplica pela bonificação

    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", nome='" + nome + '\'' +
                ", valorSalario=" + valorSalario +
                ", valorDaBonificacao=" + valorDaBonificacao +
                '}';

        //só é possível acessar o atributo pelo métod0 toString porque os atributos em FuncionarioCLT estão protected
    }
}
