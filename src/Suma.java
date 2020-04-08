public class Suma {
    public static void main(String[] args) {
        ISaludar saludar = nombre -> System.out.println("Hola mundo " + nombre);
        saludar.Saluda("Codi");

        ISuma suma = (val1, val2) -> val1 + val2;
        int resultado = suma.suma(10, 20);
        System.out.println(resultado);

        suma = (val1, val2) -> {
            int result = val1 + val2;
            System.out.println("El resultado dentro de la expresion es: " + result);
            return result;
        };
        resultado = suma.suma(100, 200);
        System.out.println(resultado);
    }
}
