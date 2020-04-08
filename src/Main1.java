import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        //Coleccion
        List<User> users = new ArrayList<>();
        Stream<User> stream = users.stream(); //abstraccion

        //Stream
        Stream<User> filter = stream.filter(user -> user.getAge() > 18);

        //Arreglo
        int[] numbers = {1, 2, 3, 4};
        Stream numbersS = Stream.of(numbers);

        //secuencia
        Stream names = Stream.of("Codi 1", "Codi 2", "Codi 3");
    }

}
