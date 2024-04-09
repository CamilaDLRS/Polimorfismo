public class Animal {
    protected String nome;
    protected String raca;

    Animal(String _nome, String _raca) {
        this.nome = _nome;
        this.raca = _raca;
    }

    Animal(String _nome) {
        this.nome = _nome;
    }

    public void emitirSom() {
        System.err.println("Fazendo barulho....");
    }

    public void movimentar() {
        System.err.println("Movimentando....");
    }
}