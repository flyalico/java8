import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<String> names = List.of("Codi 1", "Codi 2", "Codi 1", "Codi 3");
        names.stream().distinct().forEach(elemento -> System.out.println(elemento) );
    }
}
