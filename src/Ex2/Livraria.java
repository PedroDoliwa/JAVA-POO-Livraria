package Ex2;

import java.util.List;

public class Livraria {

    private Livro[] livros = new Livro[10];
    private int posicaoAtual = 0;


    public void inserirLivro(Livro livro) {
        livros[posicaoAtual] = livro;
        posicaoAtual++;
    }

    public void listarLivros() {
        for (int i = 0; i < posicaoAtual; i++) {
            System.out.println("Livro "+(i+1)+": "+livros[i].getTitulo());
        }
    }

    public void listaDisponivel() {

        for (int i = 0; i < posicaoAtual; i++) {
            if (livros[i].isDisponibilidade()==true){
                System.out.println("Livro Disponivel: "+livros[i].getTitulo());
            }
        }
    }
}
