package herança;

public class ClassePrincipal {
    public static void main (String [] args){
        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        Galinha gertrudes = new Galinha();
        gertrudes.ciscar();
        gertrudes.comer("Grão de milho");
        gertrudes.beberAgua();
        gertrudes.dormir();
    }
}
