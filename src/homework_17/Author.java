package homework_17;

import java.util.Objects;

public class Author {

    private int yearOfBirth;
    private String name;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return yearOfBirth == author.yearOfBirth && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth, name);
    }

    public Author(int yearOfBirth, String name) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;


    }

    @Override
    public String toString() {
        return "Author{" +
                "yearOfBirth=" + yearOfBirth +
                ", name='" + name + '\'' +
                '}';
    }
}
