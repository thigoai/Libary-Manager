package br.ufrn.imd.modelo;

public class Livro extends Publicacao{
	
	private String genero;
	private int numPaginas;
	
	public Livro(String titulo, String autor, int anoPublicacao,
			String genero, int numPaginas) {
		super(titulo, autor, anoPublicacao);
		this.genero = genero;
		this.numPaginas = numPaginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String getDetalhes() {
		return  "Título: " + getTitulo() + ", Autor: " + getAutor()
		+ ", Ano: " + getAnoPublicacao() + ", Genero: " + getGenero()
		+ ", Numero de paginas: " + getNumPaginas();
	}
	
}
