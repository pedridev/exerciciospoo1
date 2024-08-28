package abstração;

public class Principal {
    public static void main(String[] args){
        Funcionario joao = new Funcionario("Rua das flores", "São paulo", "Número 1542", "SP", "9823535-214", "João Paulo da Silva", "756.547.190-92", "vendedor");

        Cliente joana = new Cliente("Rua das rosas", "rio de janeiro", "RJ", "2309158912-000", "Joana almeida", "0004213298525");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
