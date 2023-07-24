package provafinal.br.ufrn.imd.modelecontrole;

public class Book {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean fiction;
    private double price;

    public Book() {
        autor = "";
        numeroPaginas = 0;
        fiction = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String a) {
        autor = a;
    }

    public void setTitulo(String t) {
        titulo = t;
    }

    public void setNumeroPaginas(int pages) {
        numeroPaginas = pages;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }

    public boolean isFiction() {
        return fiction;
    }
}
