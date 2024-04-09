public class CalculadoraArea {

    public void calcularArea(double lado) {
        double resultado = Math.pow(lado, 2);

        System.out.printf("QUADRADO = %.2f\n",resultado);
    }

    public void calcularArea(double diagonalMaior, double diagonalMenor) {
        double resultado = (diagonalMaior * diagonalMenor) / 2;

        System.out.printf("LOSANGO = %.2f\n",resultado);
    }
    
    public void calcularArea(double baseMaior, double baseMenor, double altura) {
        double resultado = ((baseMaior + baseMenor) * altura )/ 2;

        System.out.printf("TRAPEZIO = %.2f\n",resultado);
    }
}
