package tutoring03.homework;

public class CarClient {
    public static void main(String[] args) {
        Sonata sonata = new Sonata();
        Grandeur grandeur = new Grandeur();
        Avante avante = new Avante();
        Genesis genesis = new Genesis();
        sonata.run();
        grandeur.run();
        avante.run();
        genesis.run();
    }
}
