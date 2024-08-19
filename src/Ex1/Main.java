package Ex1;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Pedro");
        pessoa1.setEmail("pedro@gmail.com");

        System.out.println("Nome: "+pessoa1.getNome());
        System.out.println("Email: "+pessoa1.getEmail());
        pessoa1.logar();

        Professor prof1 = new Professor("João Paulo", "joao@gmail.com");

        System.out.println("Nome: "+prof1.getNome());
        System.out.println("Email: "+prof1.getEmail());
        prof1.logar();

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        Aluno a2 = new Aluno();
        a2.setNome("Ana");

        Turma estruturaDados = new Turma("Estrutura de Dados", prof1, 30);

        System.out.println(estruturaDados.getNome());
        estruturaDados.inserirAluno(a1);
        estruturaDados.inserirAluno(a2);
        estruturaDados.listarAluno();

    }
}