public class Veiculo {

    protected boolean ligado;
    protected double velocidade;

    Veiculo() {
        this.ligado = false;
    }

    public void acelerar() {
        if (!this.ligado) {
            System.err.println("LIGANDO VEICULO....");            
        }
        this.velocidade += 10;
        System.err.printf("VELOCIDADE EM %.2fkm....\n", this.velocidade);
    }
}
