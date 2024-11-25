package br.ufrn.imd.modelo;

public class Publicacao implements ItemBiblioteca {
	
	protected String titulo;
	protected String autor;
	protected int anoPublicacao;
	protected boolean disponivel;
	
	public Publicacao(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
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
	
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	public String getDetalhes() {
		return  "Título: " + getTitulo() + ", Autor: " + getAutor()
		+ ", Ano: " + getAnoPublicacao();
	}
	
	public boolean verificarDisponibilidade() {
		return disponivel;
	}
	
	public void emprestar() {
		if(disponivel) {
			disponivel = false;
			System.out.println("\nEmprestimo realizado");
		}else {
			System.out.println("\nItem nao disponivel");
		}
	}
	
	public void devolver() {
		if(!disponivel) {
			disponivel = true;
			System.out.println("\nItem devolvido");
		}else {
			System.out.println("\nItem ja foi devolvido");
		}
	}
	
}
