public class Circulo extends FormaGeometrica {
    private double raio;

    Circulo(double _raio) {
        this.raio = _raio;
    }

    @Override
    public void calcularArea() {
        System.err.printf("Area = %.2f\n", (Math.pow(raio, 2) *  Math.PI));
    }
}
