package creational_dp_hmw;

import creational_dp_hmw.builder_dp.BookBuilder;
import creational_dp_hmw.immutable_dp.Author;
import creational_dp_hmw.immutable_dp.Book;

public class Main {

    public static void main(String[] args) {

        //Task 1
//        DatabaseConnectionService.getDbConnection();

        //Task 2
        Author author1 = new Author("Hovhannes", "Tumanyan", 89);
//        Book book = new Book("44564", "Cat And Dog", "A fairy tale",
//                author1, LocalDate.of(1976,8, 10),
//                "This a fairy tale about dog and cat");
//
//        System.out.println(book.getAuthor());
//        Author author2 = book.getAuthor();
//        author2.setAge(200);
//        System.out.println(book.getAuthor());

        Book book2 = new BookBuilder().setCode("4654864").setAuthor(author1).build();
        System.out.println(book2);

        //Task 3
//        ShapeFactory shapeFactory = new CircleShape();
//        shapeFactory.getDrawShape();

    }
}
