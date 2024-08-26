package contabancaria;

public class Agencia {
    public static void main(String[]args){
        ContaBancaria minhaConta = new ContaBancaria("Pedro", 500);

        System.out.println("O titular da conta é : " + minhaConta.getTitular() + " e o saldo atual é de : " + minhaConta.getSaldo());

        minhaConta.setTitular("Pedro Gustavo");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("O titular da conta é : " + titularConta + " e o saldo final é de : " + saldoFinal);


    }
}
