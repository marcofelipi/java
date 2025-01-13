package biblioteca;

public class Usuario extends Pessoa {
    private String matricula;

    public Usuario(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Usuário: " + getNome() + " - Matrícula: " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }
}

