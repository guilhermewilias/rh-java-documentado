package br.com.alura.rh.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.cm.alura.rh.ValidacaoException;
import br.cm.alura.rh.model.funcionario;


//Algoritmo criado para a validação do reajuste salárial caso for necessário.


public class ValidacaoPercentualReajuste implements ValidacaoReajuste{

    public void validar(Funcionario funcionario, BigDecimal aumento){
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste(); 
            LocalDate dataAtual = LocalDate.now();
            long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

            if (mesesDesdeUltimoReajuste < 6) {
                throw new ValidacaoException("Intervalo entre reajustes salariáis devem ser maior que 6 meses.");
            }// Caso ele ja tiver sido promovido em menos de 6 meses, a ação será negada.
    }

}