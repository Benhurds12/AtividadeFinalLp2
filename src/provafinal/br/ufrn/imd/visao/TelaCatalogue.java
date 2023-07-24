package provafinal.br.ufrn.imd.visao;

import java.util.ArrayList;
import provafinal.br.ufrn.imd.modelecontrole.Catalogue;
import provafinal.br.ufrn.imd.modelecontrole.Book;

public class TelaCatalogue {
	    public static void main(String[] args) {
	        Catalogue catalogue = new Catalogue();

	        Book livro1 = new Book();
	        livro1.setTitulo("Ben Hur");
	        livro1.setAutor("Paulo Basileu");
	        livro1.setNumeroPaginas(300);
	        livro1.setPrice(29.90);
	        livro1.setFiction(true);
	        catalogue.addBook(livro1);

	        Book livro2 = new Book();
	        livro2.setTitulo("A volta dos que nao foram");
	        livro2.setAutor("Fulano");
	        livro2.setNumeroPaginas(444);
	        livro2.setPrice(39.90);
	        livro2.setFiction(true);
	        catalogue.addBook(livro2);

	        Book livro3 = new Book();
	        livro3.setTitulo("Java How to Program like a pro");
	        livro3.setAutor("Steve Jobs");
	        livro3.setNumeroPaginas(2222);
	        livro3.setPrice(199.90);
	        livro3.setFiction(false);
	        catalogue.addBook(livro3);

	        double averagePrice = catalogue.calculateAveragePrice();
	        System.out.println("Preço médio dos livros: R$" + averagePrice);
	        
	        float price = 50;
	        System.out.println("Preço verificacao: R$" + price);

	        ArrayList<Book> cheapFictionBooks = catalogue.findCheapFictionBooks(price);
	        if (cheapFictionBooks.isEmpty()) {
	            System.out.println("Não há livros de ficção com preço abaixo de R$"+ price);
	        }
	        else {
	        	System.out.println("\nLivros de ficção mais baratos que R$"+ price + ":");
	        	for (Book book : cheapFictionBooks) {
	            System.out.println("Título: " + book.getTitulo() + " | Autor: " + book.getAutor() + " | Preço: R$" + book.getPrice());
	        	}
	        }
	    }
	}
