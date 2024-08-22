package src;

public class Casa {
    public static void main(String[] args){
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
    }
}
