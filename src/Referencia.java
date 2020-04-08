import java.util.Arrays;
import java.util.List;

public class Referencia {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Calculadora calculadora = new Calculadora();
        list.stream()
                // .map(valor -> Referencia.toCuadrado(valor) )
                .map(calculadora::toCube)
                // .forEach(valor -> System.out.println(valor) );
                .forEach(System.out::println);
    }
    /*public static int toCuadrado(int numero){
        return numero*numero;

    }*/

}
