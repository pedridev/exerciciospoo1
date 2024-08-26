package polimorfismo;

public class metodoPrincipal {
    public static void main(String[] args){
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int total = calculadora.somar(sabaoPo, mamao);
        double totalDouble = calculadora.somar(sabonete, arroz);
        Integer TotalInteger = calculadora.somar(batata, cenoura, melancia);

    }
}
