package br.edu.gerenciamentoColaboradores.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    /*@Override
    public String toString() {
        return "Gerente{}";
    }
    Aparece um toString vazio pois FuncionarioPJ está como private
     */

    @Override
    public void calcularBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)) + 100d;
        //pega o valor da remuneração atraves do metodo na classe main e o valor da remuneração está na classe PJ
        //para calcular a bonificação dp gerente pega a remuneração e multiplica pela porcentagem (ex:3%) e soma 100.

    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "documento='" + super.getDocumento() + '\'' +
                ", nome='" + super.getNome() + '\'' +
                ", endereco=" + super.getEndereco().getRua() +
                ", horasTrabalhadas=" + super.getHorasTrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneracao=" + super.getValorRemuneracao() +
                ", valorBonificacao=" + this.valorBonificacao +
                '}';
    }
    //por estar private mesmo recortando e copiando dá erro sem o get.
    //usa o super pois está vindo da classe mãe (poderia ser this)
    // usa this pois vem de dentro desta classe mesmo

}
