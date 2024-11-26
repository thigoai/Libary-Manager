package br.ufrn.imd.visao;

import br.ufrn.imd.modelo.Livro;
import br.ufrn.imd.modelo.Repositorio;
import br.ufrn.imd.modelo.Revista;

public class BibliotecaVisao {
	
	public static void main(String[] args) {
		
		Repositorio repositorio = new Repositorio();
		
		 Livro livro1 = new Livro("1984", "George Orwell", 1949, "Distopia", 328);
	     Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, "Fantasia", 310);
	     Revista revista1 = new Revista("National Geographic", "Vários Autores", 2023, "Maio", 12);

	     repositorio.adicionarPublicacao(livro1);
	     repositorio.adicionarPublicacao(livro2);
	     repositorio.adicionarPublicacao(revista1);
	     
	     repositorio.listarPublicacoes();
	     
	     repositorio.procurarPorTitulo("1984");
		
	}

}
