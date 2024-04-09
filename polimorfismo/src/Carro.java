public class Carro extends Veiculo {

    @Override
    public void acelerar() {
        if (!this.ligado) {
            System.err.println("LIGANDO CARRO....");            
        }
        this.velocidade += 20;
        System.err.printf("VELOCIDADE EM %.2fkm....\n", this.velocidade);
    }
}
