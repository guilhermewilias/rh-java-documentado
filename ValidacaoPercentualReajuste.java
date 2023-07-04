package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.cm.alura.rh.ValidacaoException;
import br.cm.alura.rh.model.funcionario;



//Algoritmo criado para a validação do reajuste salárial caso for necessário.


public class ValidacaoPercentualReajuste implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario.getSalario();
            BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);

            if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
                throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!"); 
            } //Aumento salárial não pode ser mais que 40% do salario atual, a ação não será permitida.
    }

}