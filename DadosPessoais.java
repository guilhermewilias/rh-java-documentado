package br.com.alura.rh.model;

public class dadosPessoais {
    private String nome;
	private String cpf;
	private Cargo cargo;
	private BigDecimal salario;
}

//Classe criada pois na classe Funcionário foi herdada tambem para TERCEIRIZADOS, e algumas variaveis
// desta classe nao serveriam para a classe tercerizados.