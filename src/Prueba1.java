public class Prueba1 {
    public static void main(String[] args) {

        ISaludar saludar = nombre -> System.out.println("HOla mundo " + nombre);
        saludar.Saluda("Codi!!");
        ISaludar saludarDos = nombre -> {
            if (nombre.equals("Codi")) {
                System.out.println("Hola codi!, tienes el mismo nombre");
            } else {
                System.out.println("Hola mundo " + nombre);
            }
        };
        saludarDos.Saluda("Codi 2");
    }
}
