package br.com.alura.rh.model;

public enum Cargo {

//@OVerride --> Algoritmo feito para quando um funcionario bater a meta,
// 				 ele ser automaticamente promovido pelo Sistema de RH


	ASSISTENTE {
		@Override
		public Cargo getProximoCargo(){ //Return promoção para analista.
			return ANALISTA;
		} 
	}

	ANALISTA {
		@Override
		public Cargo getProximoCargo(){ //Return para promoção para especialista.
			return ESPECIALISTA;
		}
	}

	ESPECIALISTA{
		@Override
		public Cargo getProximoCargo(){ //Return para promoção para gerente (cargo máximo).
			return GERENTE;
		}
	}

	GERENTE{
		@Override
		public Cargo getProximoCargo(){ //Return gerente para gerente, pois gerente é o cargo máximo,
			return GERENTE;				//  ou seja, não dá para ter uma promoção quando você é gerente.
		}
	}

	public abstratic Cargo getProximoCargo (); // Classe de cargo abstrata. = Public abstratic Cargo.

}
