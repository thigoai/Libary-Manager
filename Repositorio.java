package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Repositorio{
	
	private ArrayList<Publicacao> publicacoes;

	public Repositorio() {
		publicacoes = new ArrayList<Publicacao> ();
	}
	
	public void adicionarPublicacao(Publicacao p) {
		publicacoes.add(p);
	}
	
	public void listarPublicacoes() {
		for (Publicacao p : publicacoes) {
			System.out.println("------------------------------------");
			p.exibirInforBasica();
		}
	} 
	
	public Publicacao procurarPorTitulo(String titulo) {
		for (Publicacao p : publicacoes) {
			if(p.getTitulo() == titulo) {
				return p;
			}
		}
		System.out.println("Item nao encontrado");
		return null;
	}
	

}
