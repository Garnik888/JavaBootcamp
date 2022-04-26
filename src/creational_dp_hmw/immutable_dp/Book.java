package creational_dp_hmw.immutable_dp;

import java.time.LocalDate;
import java.util.Objects;

public final class Book {

    private final String code;
    private final String title;
    private final String genre;
    private final Author author;
    private final LocalDate publishingYear;
    private final String description;

    public Book(String code, String title, String genre,
                Author author, LocalDate publishingYear,
                String description) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publishingYear = publishingYear;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return new Author(author.getName(), author.getSurname(), author.getAge());
    }

    public LocalDate getPublishingYear() {
        return publishingYear;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(code, book.code) && Objects.equals(title, book.title) && Objects.equals(genre, book.genre) && Objects.equals(author, book.author) && Objects.equals(publishingYear, book.publishingYear) && Objects.equals(description, book.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, title, genre, author, publishingYear, description);
    }

    @Override
    public String toString() {
        return  "code='" + code + '\'' +
                ",\ntitle='" + title + '\'' +
                ",\ngenre='" + genre + '\'' +
                ",\nauthor=" + author +
                ",\npublishingYear=" + publishingYear +
                ",\ndescription='" + description + '\'';
    }
}
