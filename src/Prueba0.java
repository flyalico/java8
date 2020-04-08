import java.util.List;

public class Prueba0 {
    public static void main(String[] args) {
        System.out.println("empezando");
        List<Integer> numeros = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
        int contador = 0;
        for (int numero : numeros) {
            if (numero > 10) {
                contador++;
            }
        }
        System.out.println("imperativo:: " + contador);
        //declarativo
        Long resultado = numeros.stream().filter(n -> n > 10).count();
        System.out.println("declarativo:: " + resultado);
    }
}
