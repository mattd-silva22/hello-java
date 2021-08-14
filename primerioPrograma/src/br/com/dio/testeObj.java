package br.com.dio;

import dr.com.dio.model.gatoModel;

public class testeObj {
	public static void main(String[] args) {
		
		int n = 0;
		String corGato;
		
		gatoModel gato = new gatoModel("felix", "pardo", 5);
		
		while(n < 5) {
			gato.falar();
			n++;
		}
		
		
		
		corGato = gato.getCor();
		System.out.println(corGato);
		//System.out.println(gato.getNome()); getNome esta como protegido
		
		// protegido so permite uso do metedo para classes dentro do mesmo pacote
		
		
		
		
		
		
	}
}