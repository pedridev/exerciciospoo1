package abstração;

public class principal {
    public static void main(String[] args){
        funcionario joao = new funcionario("Rua das flores", "São paulo", "Número 1542", "SP", "9823535-214", "João Paulo da Silva", "756.547.190-92", "vendedor");

        cliente joana = new cliente("Rua das rosas", "rio de janeiro", "RJ", "2309158912-000", "Joana almeida", "0004213298525");

        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }
}
