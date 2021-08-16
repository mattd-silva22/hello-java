package dr.com.dio.model;

public class livroModel {

	private String titulo;
	private String autor;
	private String editora;
	private int numeroPaginas;
	
	public livroModel(String titulo, String autor, String editora, int numeroPaginas) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public void mostraInfo() {
		
		System.out.println("######################################################");
		System.out.println("Livro: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Editora: " + this.editora);
		System.out.println("Numero de paginas: " + this.numeroPaginas);
		System.out.println("######################################################");
		
		
	}
	
	
	
	
}
