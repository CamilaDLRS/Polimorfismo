public class Cachorro extends Animal {
    
    Cachorro(String _nome, String _raca) {
        super(_nome, _raca);
    }

    @Override
    public void emitirSom() {
        System.err.println("AU AU....");
    }
}