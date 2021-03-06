import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        //obtener la cantidad de usuarios con una edad mayor a 21
        //y que username comience con r

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 20));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));
        users.add(new User("franko", 33));
        users.stream()
                //.map(user -> user.getUsername())
                .map(User::getUsername)
                .forEach(System.out::println);
    }
}
