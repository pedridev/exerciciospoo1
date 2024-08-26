package associação;

public class funcionarios {
    private String nome;

    public funcionarios(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override public String toString() {
        return "funcionarios{" + "nome='" + nome + '\'' + '}';
    }
}
