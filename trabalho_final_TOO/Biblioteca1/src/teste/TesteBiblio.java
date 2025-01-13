package teste;

import biblioteca.*;
import java.time.LocalDate;

public class TesteBiblio {
    public static void main(String[] args) {
     
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123");
        Livro livro2 = new Livro("1984", "George Orwell", "124");
        
        //cria exemplares dos livros
        Exemplar exemplar1 = new Exemplar(1, livro1);
        Exemplar exemplar2 = new Exemplar(2, livro1);
        Exemplar exemplar3 = new Exemplar(3, livro2);
        
        //adiciona exemplares
        livro1.adicionarExemplar(exemplar1);
        livro1.adicionarExemplar(exemplar2);
        livro2.adicionarExemplar(exemplar3);
        
        //cria usuários e funcionários
        Usuario maria = new Usuario("Maria Silva", "A12345");
        Usuario fernanda = new Usuario("Fernanda Eduarda", "B123");
        Usuario pedro = new Usuario("Pedro Costa", "C67890");
        Funcionario funcionario = new Funcionario("João Pereira", Cargo.BIBLIOTECARIO);

        System.out.println("Início:");
        System.out.println("Livro: " + livro1.getTitulo() + " - Exemplares disponíveis: " + livro1.exemplaresDisponiveis());
        System.out.println("Livro: " + livro2.getTitulo() + " - Exemplares disponíveis: " + livro2.exemplaresDisponiveis());

        LocalDate dataEmprestimo = LocalDate.now(); //definindo as datas
        LocalDate dataDevolucao = dataEmprestimo.plusDays(14); //14 dias após o emprestimo
        
        Emprestimo emprestimo1 = new Emprestimo(maria, exemplar1, funcionario, dataEmprestimo, dataDevolucao); //empresta exemplar 1
        Emprestimo emprestimo2 = new Emprestimo(fernanda, exemplar1, funcionario, dataEmprestimo, dataDevolucao);
        Emprestimo emprestimo3 = new Emprestimo(pedro, exemplar1, funcionario, dataEmprestimo, dataDevolucao); // Tentando pegar um exemplar já emprestado
        
        //realiza emprestimos
        emprestimo1.emprestar();
        emprestimo2.emprestar();
        emprestimo3.emprestar();

        // Exibindo status após os empréstimos
        System.out.println("\nEstado após empréstimos:");
        System.out.println("Livro: " + livro1.getTitulo() + " - Exemplares disponíveis: " + livro1.exemplaresDisponiveis());
        System.out.println("Livro: " + livro2.getTitulo() + " - Exemplares disponíveis: " + livro2.exemplaresDisponiveis());

        //devolvendo os livros
        emprestimo1.devolver();
        
        System.out.println("\nFinal:");
        System.out.println("Livro: " + livro1.getTitulo() + " - Exemplares disponíveis: " + livro1.exemplaresDisponiveis());
        System.out.println("Livro: " + livro2.getTitulo() + " - Exemplares disponíveis: " + livro2.exemplaresDisponiveis());
    }
}
