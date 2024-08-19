package Ex2;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Caçador", "Joao Paulo", 200, true);
        l1.exibirDetalhes();
        l1.reservar(l1);


        Livro l2 = new Livro("Dragao", " Paulo", 220, false);
        l2.reservar(l2);

        l1.devolver(l1);
        System.out.println(l1.isDisponibilidade());

        Livraria livraria = new Livraria();
        livraria.inserirLivro(l1);
        livraria.inserirLivro(l2);
        livraria.listarLivros();
        livraria.listaDisponivel();




    }
}
