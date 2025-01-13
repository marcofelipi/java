package biblioteca;

public abstract class Pessoa { //classe abstrata, implementada apenas em usuário e funcionario
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void exibirInformacoes();
}

