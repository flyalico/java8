import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        //obtener la cantidad de usuarios con una edad mayor a 21
        //y que username comience con r
        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul",21));
        long contador = 0;
       // contador = (int)users.stream().filter(user -> user.getAge() < 21).count();
        contador =  users.stream()
                .filter(user -> user.getAge()>18 )
                .filter(user -> user.getUsername().startsWith("R") )
                .count();
         //System.out.println(contador);

        Stream<User> stream = users.stream();
        /*System.out.println( stream.filter(user ->
                user.getAge()>18).count() );*/
        //obtener todos los usuarios q tengan una edad mayor a 18
       List<User> newUsers = users.stream()
                .filter(user -> user.getAge()>18)
                .collect(Collectors.toList());
       // System.out.println(newUsers);

        //Map obtener el cuadrado de todos los numeros en la lista
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result =  numeros.stream()
                                .map(num ->num*num )
                                .collect(Collectors.toList());
        //System.out.println(result);
        //usando forEach
      /*  numeros.stream()
                .map(num ->num*num ).forEach(num-> System.out.println(num) );*/
        //quitando map y que vaya dentro del forEach
        /*numeros.stream()
                .forEach(num -> {
                    int resultado = num * num;
                    System.out.println(resultado);
                } );*/
        //FlatMap une listas
        List<String> names1 = Arrays.asList("Codi 1", "Codi 2");
        List<String> names2 = Arrays.asList("Codi 3", "Codi 4");
        List<String> names3 = Arrays.asList("Codi 5", "Codi 6");
        List<String> names4 = Arrays.asList("Codi 7", "Codi 8");
        List<String> union = Stream.of(names1,names2, names3, names4)
                    .flatMap(elemento -> elemento.stream())
                    .collect(Collectors.toList());
       // System.out.println(union);

        //Conocer si un alumno posee por lo menos una calificacion no aprobatoria
        //La calificacion minima aprobatoria es 6
        List<Integer> calificaciones = List.of(10,10,9,5,6,7,8,9,10 );
       /* boolean resultt = calificaciones.stream()
                .filter(calificacion -> calificacion < 6 ).count() > 0;*/
       //using anyMatch
      /* boolean resultt = calificaciones.stream()
               .anyMatch(cali -> cali < 6);
       System.out.println(resultt);*/

      //obtener el nombre de un usuario q tenga una edad igual a 25
        User userDefault = new User("Sin nombre",30);
        User user = users.stream()
                       .filter(u -> u.getAge() == 20 )
                       .findFirst() //.findAny()
                       .orElse(userDefault); //.get();
        System.out.println(user.getUsername());
    }


}
