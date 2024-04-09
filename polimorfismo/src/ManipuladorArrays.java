public class ManipuladorArrays {

    public Integer[] adicionarElemento(Integer[] array, Integer novoElemento) {
        Integer[] newArray = new Integer[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = novoElemento;

        return newArray;
    }

    public Integer[] removerElemento(Integer[] array, Integer indexElemento) {
        Integer[] newArray = new Integer[array.length - 1];

        Integer index = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexElemento != i) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public void encontrarMaximo(Integer[] array) {

        Integer maiorElemento = 0;
        for (Integer elemento : array) {
            if (elemento > maiorElemento) {
                maiorElemento = elemento;
            }
        }

        System.out.printf("MAIOR ELEMENTO INTEIRO= %d\n", maiorElemento);
    }

    public void calcularMedia(Integer[] array) {
        double media = 0;
        for (Integer elemento : array) {
            media += elemento;
        }
        media = media / array.length;

        System.out.printf("MEDIA = %.2f\n", media);
    }

    public void imprimirElementos(Integer[] array) {
        for (Integer elemento : array) {
            System.out.printf("%d ", elemento);
        }
        System.out.println();
    }
   
   
    public Double[] adicionarElemento(Double[] array, Double novoElemento) {
        Double[] newArray = new Double[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = novoElemento;

        return newArray;
    }

    public Double[] removerElemento(Double[] array, Integer indexElemento) {
        Double[] newArray = new Double[array.length - 1];

        Integer index = 0;
        for (int i = 0; i < array.length; i++) {
            if (indexElemento != i) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }

    public void encontrarMaximo(Double[] array) {

        Double maiorElemento = 0.0;
        for (Double elemento : array) {
            if (elemento > maiorElemento) {
                maiorElemento = elemento;
            }
        }

        System.out.printf("MAIOR ELEMENTO FLUTUANTE= %.2f\n", maiorElemento);
    }

    public void calcularMedia(Double[] array) {
        Double media = 0.0;
        for (Double elemento : array) {
            media += elemento;
        }
        media = media / array.length;

        System.out.printf("MEDIA FLUTUANTE= %.2f\n", media);
    }

    public void imprimirElementos(Double[] array) {
        for (Double elemento : array) {
            System.out.printf("%.2f ", elemento);
        }
        System.out.println();
    }
}
