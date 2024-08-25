package src;

public class DefinindoAtributosCasa {
    // atributos

    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir() {
        System.out.println("A casa foi construída, as características da casa são : ");
        System.out.println();
        System.out.println("Metragem : " + metragem);
        System.out.println("Número de Quartos : " + numeroQuartos);
        System.out.println("Número de Banheiros : " + numeroBanheiros);
        System.out.println("Material : " + material);

    }

    public void pintar() {
        System.out.println("A casa foi pintada de : " + cor);
    }

    public void mudarCorParede(String novaCor){
        cor = novaCor;  
        pintar();
    }
    public int somarMetragem() {
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public static void main(String[] args) {
        // criando o objeto casa

        DefinindoAtributosCasa casa = new DefinindoAtributosCasa();

        // inicializando atributos (variaveis e características) casa.

        casa.numeroBanheiros = 5;
        casa.numeroQuartos = 3;
        casa.metragem = 250;

        casa.material = "Tijolo";
        casa.cor = "Branco";

        casa.construir();
        casa.pintar();
        casa.mudarCorParede("Cinza");

        int resultado = casa.somarMetragem();
        System.out.println(resultado);
    }
}

