import java.util.List;

public class Matematica {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Long cantidad = numeros.stream().filter(n -> n > 6).count();
        System.out.println(cantidad);

        int suma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println(suma);

        double promedio = numeros.stream().mapToInt(n -> n).average().orElse(0);
        System.out.println(promedio);

        int maximo = numeros.stream().mapToInt(n -> n).max().getAsInt();
        System.out.println(maximo);
    }
}
