package br.edu.gerenciamentoColaboradores;

import br.edu.gerenciamentoColaboradores.models.Endereco;
import br.edu.gerenciamentoColaboradores.models.Gerente;
import br.edu.gerenciamentoColaboradores.models.OperadorDeCaixa;
import br.edu.gerenciamentoColaboradores.models.Vendedor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Lagoa da Conceição", "Complemento", "Servidão Ruth Bastos de Oliveira");

        //o construtor vazio não funciona mais, pois na classe Endereço tem um construtor com parâmetros.
        //mas se lá tem um contrutor vazio funciona ou getters e setters ou os dois juntos
        //new pede para armazenar na memória um local para guardar um novo objeto da classe endereço.

        /*ATRIBUINDO E RETORNANDO VALORES DE ATRIBUTOS DOS OBJETOS ATRAVÉS DE GET E SET.
        endereco.setRua("Servidao Ruth Bastos de Oliveira");
        System.out.println(endereco.getRua());
        */

        System.out.println("--------------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Juliana Nunes da Silva");
        vendedor.setDocumento("800.425.969-46");
        vendedor.setEndereco(endereco);
        vendedor.setValorSalario(1760.00);

        vendedor.calcularBonificacao(2d);

        System.out.println(vendedor);
        //mostra apenas o endereço de memória, é preciso sobrescrever o métod0 toString

        System.out.println("--------------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("6659462646", endereco, "Tami", 1540.00);
        //Dá certo pois na classe OperadorDeCaixa foi sobrescrito o métod0 construtor.
        System.out.println(operadorDeCaixa);

        System.out.println("--------------");

        Gerente gerente = new Gerente();
        //quando não cria um construtor, usa esse vazio
        gerente.setDocumento("8445428489");
        gerente.setEndereco(endereco);
        gerente.setNome("Tami A");
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100.0);

        gerente.calcularRemuneracao();
        gerente.calcularBonificacao(3.0);

        System.out.println(gerente);





    }
}