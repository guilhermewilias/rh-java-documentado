package br.com.alura.rh.service;
import java.math.BigDecimal; 

//Algoritmo criado para fornecer um reajuste salárial aos funcionários.


public class reajusteService {

        private List <ValidacaoReajuste> validacoes;


        public reajusteService(List<ValidacaoReajuste>validacoes){
            this.validacoes = validacoes; 
        }

        public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
            this.validacoes.forEach(v -> v.validar(funcionario.aumento));
  
            BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
            funcionario.atualizarSalario ();
        }    
        
} 