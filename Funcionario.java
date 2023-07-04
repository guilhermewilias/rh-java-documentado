package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario { //Classe Funcionários.

	private dadosPessoais dadosPessoais; //Var absoluta, private pois nao pode ser alterada.
	private LocalDate dataUltimoReajuste; //Var absoluta, private pois nao pode ser alterada.

	//Váriaveis para Funcionarios com disponibilidade para HERENÇA para a classe Tercerizada. 

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public void atualizarSalario(BigDecimal novoSalario) { //Atualização de salário.
		this.salario = novoSalario;
		this.dataUltimoReajuste = LocalDate.now();
	}

	//Getter e Setters

	public String getNome() { //Get nome
		return nome;
	}

	public void setNome(String nome) { //Set nome
		this.nome = nome;
	}

	public String getCpf() { //Get cpf
		return cpf;
	}

	public void setCpf(String cpf) { //Set cpf
		this.cpf = cpf;
	}

	public Cargo getCargo() { //get cargo
		return cargo;
	}

	public void setCargo(Cargo cargo) { //Set cargo
		this.cargo = cargo;
	}

	public BigDecimal getSalario() { //Get salário
		return salario;
	}

	public void setSalario(BigDecimal salario) { //Set salário
		this.salario = salario;
	}

	public LocalDate getDataUltimoReajuste() { //Get reajuste de salário
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) { //Set reajuste de salário
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void promover(Cargo novoCargo){ //Var para promover. 
		this.cargo = novoCargo; 
	}

}
