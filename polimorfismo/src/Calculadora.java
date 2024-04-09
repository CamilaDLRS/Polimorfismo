public class Calculadora {

    public void soma(int argUm, int argDois) {
        System.out.printf("%d + %d = %d\n", argUm, argDois, (argUm + argDois));
    }

    public void soma(double argUm, double argDois) {
        System.out.printf("%.2f + %.2f = %.2f\n", argUm, argDois, (argUm + argDois));
    }

    public void soma(int argInteiro, double argFlutuante) {
        System.out.printf("%d + %.2f = %.2f\n", argInteiro, argFlutuante, (argInteiro + argFlutuante));
    }
}
