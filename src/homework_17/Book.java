package homework_17;

import java.util.Objects;

public class Book implements Cloneable {

    private int yearOfPublishing;
    private String name;
    private String author;
    private Book book;

    public Book(int yearOfPublishing, String name, String author) {
        this.yearOfPublishing = yearOfPublishing;
        this.name = name;
        this.author = author;
    }

    public Book() {;

    }

    @Override
    protected Book clone() throws CloneNotSupportedException {
        return(Book) super. clone();
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = String.valueOf(author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfPublishing, name, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearOfPublishing=" + yearOfPublishing +
                ", name='" + name + '\'' +
                ", author=" + author +
                '}';
    }
}
