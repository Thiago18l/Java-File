import java.util.*;

public class App {
	public static void main(String args[]) {
		
		
		
		Livros livro = new Livros();
		livro.setNome("Livro de Java");
		livro.setAutor("Rodrigo Turini");
		livro.setPre�o(69.90);
		
		Livros livro2 = new Livros();
		livro2.setNome("Cosmos");
		livro2.setAutor("Carl sagan");
		livro2.setPre�o(59.90);
		
		CD cd = new CD();
		cd.setNome("Link park");
		cd.setN_faixas(15);
		cd.setPre�o(29.90);
		
		DVD dvd = new DVD();
		dvd.setNome("DVD qualquer");
		dvd.setPre�o(39.90);
		dvd.setDura��o(120.00);
		
		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(livro2);
		produtos.add(livro);
		produtos.add(cd);
		produtos.add(dvd);
		
		
		
		for(Produto produto : produtos) {
			
			System.out.println("Pre�o do Produto: R$"+produto.getPre�o()+"");
			System.out.println("Nome do Produto:"+produto.getNome());
			System.out.println(produto);
			
			
		}
		
	}
}
