package kian.mobilesoft.retrofit2.models;

public class Book {

    long id;
    String title;
    String author;
    String bookUrl;
    String imageUrl;
    String displayDate;
    int numberOfPages;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookUrl() {
        return bookUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
}
