package polimorfismo;

public class MetodoPrincipal {
    public static void main(String[] args){
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;
        // click botao esquerdo do mouse + ctrl
        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer TotalInteger = Calculadora.somar(batata, cenoura, melancia);

        Carro polo = new Carro();
        polo.mover();
    }
}
