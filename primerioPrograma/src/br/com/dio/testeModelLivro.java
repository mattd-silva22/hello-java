package br.com.dio;

import dr.com.dio.model.livroModel;

public class testeModelLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		livroModel meuLivro1 = new livroModel("Bras Cubas", "Machado de Assis", "Cia das Letras", 325);
		
		livroModel meuLivro2 = new livroModel("Capitaes de Areia", "Jorge Amado", "Bahia Livros", 413);
		
		meuLivro1.mostraInfo();
		meuLivro2.mostraInfo();
	}

}
