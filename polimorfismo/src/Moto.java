public class Moto extends Veiculo {

    @Override
    public void acelerar() {
        if (!this.ligado) {
            System.err.println("LIGANDO MOTO....");            
        }
        this.velocidade += 30;
        System.err.printf("VELOCIDADE EM %.2fkm....\n", this.velocidade);
    }

}
