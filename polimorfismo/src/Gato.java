public class Gato extends Animal {

    Gato(String _nome, String _raca) {
        super(_nome, _raca);
    }

    @Override
    public void emitirSom() {
        System.err.println("MIAU....");
    }
}