package br.ufrn.imd.modelo;

public interface ItemBiblioteca {
	
	String getTitulo();
    String getAutor();
    int getAnoPublicacao();
	
	String getDetalhes(); 
	boolean verificarDisponibilidade();
	void emprestar();
	void devolver();
	
	default void exibirInforBasica() {
		System.out.println("Titulo: " + getTitulo() + ", Autor: " + getAutor() 
		+ ", Ano: " + getAnoPublicacao());
	}
	
}
