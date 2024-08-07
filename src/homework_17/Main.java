package homework_17;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Book book = new Book(2016, "Sapiens: Краткая история человечетва", "Yuval Hariri");
        Author author = new Author(1970, "Yuval Hariri");

        book.setAuthor(author);

        Book clone = book.clone();

       // clone.setAuthor().setName("Daniel");
        clone.setYearOfPublishing(2018);

        System.out.println(book);
        System.out.println(clone);


    }
}
