package abstração;

public class Funcionario extends Endereco implements Pessoa {
    private String nome;
    private String documento;
    private String cargo;

    public Funcionario(String numero, String rua, String cidade, String estado, String cep, String nome, String documento, String cargo) {

        // "super" reverencia o método pai (que no caso é a classe
        // abstrata "endereco"
        super(numero, rua, cidade, estado, cep);
        this.nome = nome;
        this.documento = documento;
        this.cargo = cargo;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override public void mostrarEndereco() {
        System.out.println("Endereço do funcionario" + getRua() + "," + getCidade() + "," + getNumero() + "," + getEstado() + "," + getCep());
    }

    @Override public String toString() {
        return "funcionario{" + "nome='" + nome + '\'' + ", documento='" + documento + '\'' + ", cargo='" + cargo + '\'' + '}';
    }
}
