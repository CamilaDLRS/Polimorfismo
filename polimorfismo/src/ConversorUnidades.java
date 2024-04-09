public class ConversorUnidades {

    public void converter(double quilogramas, String unidade) {
        if (unidade.equals("gramas")) {
            double resultado = quilogramas * 1000;
            System.out.printf("%.2f quilogramas são %.2f gramas\n", quilogramas, resultado);

        }
        if (unidade.equals("libras")) {
            double resultado = quilogramas * 2.205;
            System.out.printf("%.2f quilogramas são %.2f libra\n", quilogramas, resultado);

        }
    }

    public void converter(double anozLuz) {
        double resultado = anozLuz * 9.461e12;
        System.out.printf("%.2f anozLuz são %.2f quilomentros\n", anozLuz, resultado);
    }

    public void converter(Integer horas) {
        Integer resultado = horas * 60;
        System.out.printf("%d horas são %d minutos\n", horas, resultado);
    }

}
