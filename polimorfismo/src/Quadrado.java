public class Quadrado extends FormaGeometrica {
    private double lado;

    Quadrado(double _lado) {
        this.lado = _lado;
    }

    @Override
    public void calcularArea() {
        System.err.printf("Area = %.2f\n", (lado*lado));
    }
}
