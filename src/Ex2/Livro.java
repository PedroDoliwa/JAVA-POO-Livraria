package Ex2;

public class Livro {

     private String titulo;
     private String autor;
     private int numeroPaginas;
     private boolean disponibilidade;

    public Livro(String titulo, String autor, int numeroPaginas, Boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = disponibilidade;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de Paginas: " + this.numeroPaginas);
        System.out.println("Disponibilidade: " + this.disponibilidade);
    }

    public void reservar(Livro livro){
        if(livro.disponibilidade == true){
            System.out.println("Reserva confirmada.");
            this.disponibilidade=false;
        }else{
            System.out.println("Livro ja está reservado.");
        }
    }

    public void devolver(Livro livro){
        this.disponibilidade=true;
        System.out.println("Devolucao confirmada");
    }


}
