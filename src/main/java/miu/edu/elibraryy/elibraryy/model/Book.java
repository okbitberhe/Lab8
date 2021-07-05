package miu.edu.elibraryy.elibraryy.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;


 @Entity
@Table(name = "books")
public class Book {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
     @NotBlank(message = "isbn is required")
    private String isbn;
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datePublished;
    private double overdueFee;

    public Book() {
    }

    public Book(Long bookId, String isbn, String title, LocalDate datePublished, double overdueFee) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.title = title;
        this.datePublished = datePublished;
        this.overdueFee = overdueFee;
    }

    public Book(String isbn, String title, LocalDate datePublished, double overdueFee) {
        this.isbn = isbn;
        this.title = title;
        this.datePublished = datePublished;
        this.overdueFee = overdueFee;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    public double getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(double overdueFee) {
        this.overdueFee = overdueFee;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", datePublished=" + datePublished +
                ", overdueFee=" + overdueFee +
                '}';
    }
}
