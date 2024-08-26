package herança;

public class classePrincipal {
    public static void main (String [] args){
        cachorro caramelo = new cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        galinha gertrudes = new galinha();
        gertrudes.ciscar();
        gertrudes.comer("Grão de milho");
        gertrudes.beberAgua();
        gertrudes.dormir();
    }
}
