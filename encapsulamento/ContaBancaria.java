package encapsulamento;

public class ContaBancaria {
    // encapsulamento; atributos privados

    private String titular;
    private double saldo;

    // getter e setter; métodos padrões pra acessar e modificar os atributos.

    // método pra obter o titular
    public String getTitular() {
        return titular;
    }

    // método pra modificar o titular

    public void setTitular(String novoTitular) {
        this.titular=novoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // construtor com atributos
    public ContaBancaria(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
}
