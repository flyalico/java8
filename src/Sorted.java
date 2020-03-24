import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,6,8,9,2,4,6,7,8,10,1,2,3);
        List<Integer> result = numbers.stream().sorted().collect(Collectors.toList());
       // System.out.println(result);
        System.out.println("probando");
        List<Book> books = new ArrayList<>();
        books.add(new Book("El señor de los anillos", 150));
        books.add(new Book("Don Quijote de la mancha",500));
        books.add(new Book("Historia de dos ciudades",200));
        books.add(new Book("El hobbit",100));
        books.add(new Book("cafarnaun",100));
         books.add(new Book("kubernetes",100));
        books.add(new Book("docker",100)); 
        books.add(new Book("microservicios",100)); 
		 books.add(new Book("spring cloud",100));  
		  
		  
		  
		  
        Comparator<Book> comparatorCopies = Comparator.comparing(book -> book.getCopies() );
        Comparator<Book> comparatorTitle = Comparator.comparing(book -> book.getTitle());

        books.stream()
                .sorted(comparatorCopies.reversed())
                .limit(3)
                //.skip(1)
                .forEach(book -> System.out.println(book.getTitle()+" "+book.getCopies()) );
    }
}
 