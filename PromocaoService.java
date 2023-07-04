package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;

//Algoritmo criado para promover uma promoção para os funcionários.


public class PromocaoService {
    
    public void promover (Funcionario funcionario, Boolean metaBatida){
        if (Cargo.GERENTE == funcionario.CargoAtual()){
            throw new ValidacaoException ("Gerentes não podem ser promovidos");
        } //Gerente é o cargo máximo, então não se pode ser promotivo. 

        
        if (metaBatida ){
            Cargo novoCargo = CargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        }else {
            throw new ValidacaoException ("Funcionário não bateu a meta!"); 
        } //Se o funcionário não bater a meta, ele não é promovido.

        
    }
}