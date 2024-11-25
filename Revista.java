package br.ufrn.imd.modelo;

public class Revista extends Publicacao{
	
	private String edicao;
	private int numArtigos;
	
	public Revista(String titulo, String autor, int anoPublicacao, String edicao, int numArtigos) {
		super(titulo, autor, anoPublicacao);
		this.edicao = edicao;
		this.numArtigos = numArtigos;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getNumArtigos() {
		return numArtigos;
	}

	public void setNumArtigos(int numArtigos) {
		this.numArtigos = numArtigos;
	}
	
	@Override 
	public String getDetalhes() {
		return  "Título: " + getTitulo() + ", Autor: " + getAutor()
		+ ", Ano: " + getAnoPublicacao() + ", Edicao: " + getEdicao()
		+ ", Numero de artigos: " + getNumArtigos();
	}
	

}
