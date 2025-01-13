package biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Usuario usuario;
    private Exemplar exemplar;
    private Funcionario funcionario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Exemplar exemplar, Funcionario funcionario, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.usuario = usuario;
        this.exemplar = exemplar;
        this.funcionario = funcionario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Empresta um exemplar se não estiver emprestado
    public boolean emprestar() {
        if (exemplar.isEmprestado()) {
            System.out.println("Não há exemplares disponíveis para empréstimo.");
            return false;
        } else {
            exemplar.emprestar();
            System.out.println("Empréstimo realizado com sucesso!");
            return true;
        }
    }

    // Devolve o exemplar
    public void devolver() {
        exemplar.devolver();
        System.out.println("Exemplar devolvido.");
    }

    @Override
    public String toString() {
        return "Empréstimo de " + usuario.getNome() + " - Livro: " + exemplar.getLivro().getTitulo() + " (ID Exemplar: " + exemplar.getIdExemplar() + ")";
    }
}
