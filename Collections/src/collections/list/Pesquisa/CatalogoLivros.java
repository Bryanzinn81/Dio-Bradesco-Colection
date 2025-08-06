package collections.list.Pesquisa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CatalogoLivros {
		private List<Livro> livrolist;

		public CatalogoLivros() {
			this.livrolist = new ArrayList<>();
		}
		
		public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
			livrolist.add(new Livro(titulo, autor, anoPublicacao));
		}
		public List<Livro> pesquisarPorAutor(String autor){
			List<Livro> livrosPorAutor = new  ArrayList<>();
			if (!livrolist.isEmpty()) {
				for(Livro l : livrolist) {
					if(l.getAutor().equalsIgnoreCase(autor)) {
						livrosPorAutor.add(l);
					}
				}
			}
			return livrosPorAutor;
		}
		
		public List<Livro> pesquisarIntervalo(int anoInicial, int anoFinal){
			List<Livro> livrosIntervalo = new ArrayList<Livro>();
			if(!livrolist.isEmpty()) {
				for(Livro l : livrolist) {
					if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal) {
						livrosIntervalo.add(l);
					}
				}
			}
			return livrosIntervalo;
		}
		
		public CatalogoLivros pesquisarPorTitulo(String titulo) {
			Livro livroPorTitulo = null;
			if (!livrolist.isEmpty()) {
				
				for(Livro l : livrolist) {
					if(l.getTitulo().equalsIgnoreCase(titulo)) {
						livroPorTitulo = l;
						break;
					}
				}
			}
			return livroPorTitulo;
		}
}
