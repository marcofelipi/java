package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;
    private String idLivro;
    private List<Exemplar> exemplares;

    public Livro(String titulo, String autor, String idLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.exemplares = new ArrayList<>();
    }

    // Adiciona exemplares ao livro
    public void adicionarExemplar(Exemplar exemplar) {
        exemplares.add(exemplar);
    }

    // Verifica e retorna a quantidade de exemplares disponíveis
    public int exemplaresDisponiveis() {
        int count = 0;
        for (Exemplar exemplar : exemplares) {
            if (!exemplar.isEmprestado()) {
                count++;
            }
        }
        return count;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }
    
    @Override
    public String toString() {
        return "Livro: " + titulo + " (" + autor + ")";
    }
}
