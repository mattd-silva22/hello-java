package dr.com.dio.model;

public class gatoModel {
	
	private String nome;
	private String cor;
	private int idade;
	
	public gatoModel(String nome, String cor, int idade) {
		
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		
	}
	
	public void falar() {
		System.out.println("miau!");
	}

	protected String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
	
	
	
}
