public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("EXERCÍCIOS SOBRESCRITA\n");

        Animal animal = new Animal("Pingo", "passarinho");
        Cachorro cachorro = new Cachorro("Teca", "Ilhasa");
        Gato gato = new Gato("Zeus", "não sei");

        animal.emitirSom();
        cachorro.emitirSom();
        gato.emitirSom();

        System.out.println();

        Quadrado quadrado = new Quadrado(7.4);
        Circulo circulo = new Circulo(4.6);

        quadrado.calcularArea();
        circulo.calcularArea();

        System.out.println();

        Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Moto moto = new Moto();

        veiculo.acelerar();
        carro.acelerar();
        moto.acelerar();

        System.out.println();

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        pessoa.saudacao();
        aluno.saudacao();
        professor.saudacao();

        System.out.println();

        Peixe peixe = new Peixe("Nemo");
        Ave ave = new Ave("Pingo");

        animal.movimentar();
        peixe.movimentar();
        ave.movimentar();

        System.out.println();
        System.out.println("EXERCÍCIOS SOBRECARGA\n");

        Calculadora calculadora = new Calculadora();

        calculadora.soma(10, 20);
        calculadora.soma(10.5, 20.3);
        calculadora.soma(10, 20.3);

        System.out.println();

        ConversorUnidades conversorUnidades = new ConversorUnidades();

        conversorUnidades.converter(4.5);
        Integer horas = 8;
        conversorUnidades.converter(horas);
        conversorUnidades.converter(780, "gramas");
        conversorUnidades.converter(780, "libras");

        System.out.println();

        ManipuladorStrings manipuladorStrings = new ManipuladorStrings();

        manipuladorStrings.concatenar("Eu ", "Gosto");
        manipuladorStrings.concatenar("Eu ", "Gosto ", "De");
        manipuladorStrings.concatenar("Eu ", "Gosto ", "De ", "Coxinha");

        System.out.println();

        CalculadoraArea calculadoraArea = new CalculadoraArea();

        calculadoraArea.calcularArea(5.5);
        calculadoraArea.calcularArea(7.3, 4);
        calculadoraArea.calcularArea(9, 4, 3.2);

        /* O exercicio pedia um manipulador de listas, porém como a tipagem da lista não é 
        considerada na complação, não é possível realizar sobrecarregar de métodos onde apenas 
        a tipagem de argumentos de lista são alterados em suas assisnaturas. Logo, devido o 
        objetivo do exercicio ser aplicar sobrecargargas, optou-se por realizar-o utilizando arrays. */

        System.out.println();

        ManipuladorArrays manipuladorArrays = new ManipuladorArrays();

        Integer[] arrayInteger = new Integer[5];
        arrayInteger[0] = 10;
        arrayInteger[1] = 1;
        arrayInteger[2] = 8;
        arrayInteger[3] = 3;
        arrayInteger[4] = 4;

        arrayInteger = manipuladorArrays.adicionarElemento(arrayInteger, 100);
        manipuladorArrays.imprimirElementos(arrayInteger);
        arrayInteger = manipuladorArrays.removerElemento(arrayInteger, 2);
        manipuladorArrays.imprimirElementos(arrayInteger);
        manipuladorArrays.encontrarMaximo(arrayInteger);
        manipuladorArrays.calcularMedia(arrayInteger);

        Double[] arrayDouble = new Double[5];

        arrayDouble[0] = 13.2;
        arrayDouble[1] = 15.4;
        arrayDouble[2] = 81.2;
        arrayDouble[3] = 3.0;
        arrayDouble[4] = 4.7;

        arrayDouble = manipuladorArrays.adicionarElemento(arrayDouble, 100.5);
        manipuladorArrays.imprimirElementos(arrayDouble);
        arrayDouble = manipuladorArrays.removerElemento(arrayDouble, 4);
        manipuladorArrays.imprimirElementos(arrayDouble);
        manipuladorArrays.encontrarMaximo(arrayDouble);
        manipuladorArrays.calcularMedia(arrayDouble);
    }
}
