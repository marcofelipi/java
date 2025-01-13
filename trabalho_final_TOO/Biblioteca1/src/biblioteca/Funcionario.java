package biblioteca;

public class Funcionario extends Pessoa {
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário: " + getNome() + " - Cargo: " + cargo);
    }

    public Cargo getCargo() {
        return cargo;
    }
}
