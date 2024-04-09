public class Peixe extends Animal {

    Peixe(String _nome) {
        super(_nome);
    }

    @Override
    public void movimentar() {
       System.out.println("NADANDO.....");
    }

}
