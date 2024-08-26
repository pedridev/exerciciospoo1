package abstração;

public class cliente extends endereco implements pessoa {
    private String nome;
    private String documento;

    public cliente(String rua, String cidade, String estado, String cep, String nome, String documento) {
        super(rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
    }


    @Override public String getNome() {
        return nome;
    }

    @Override public void setNome(String nome) {
        this.nome = nome;
    }

    @Override public String getDocumento() {
        return documento;
    }

    @Override public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override public String toString() {
        return "cliente{" + "nome='" + nome + '\'' + ", documento='" + documento + '\'' + '}';
    }

    @Override public void mostrarEndereco() {
        System.out.println("Endereço do cliente " + getRua() + ", " + getCidade() + ", " + getEstado() + ", " + getCep());
    }
}
