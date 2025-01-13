package biblioteca;

public class Exemplar {
    private int idExemplar;
    private Livro livro;
    private boolean emprestado;

    public Exemplar(int idExemplar, Livro livro) {
        this.idExemplar = idExemplar;
        this.livro = livro;
        this.emprestado = false; // Por padrão, não emprestado
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public int getIdExemplar() {
        return idExemplar;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return "Exemplar ID: " + idExemplar + " - Emprestado: " + emprestado;
    }
}
