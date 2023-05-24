package org.example;

public class Book implements Loanable {
    private Publisher publisher;
    private String borrower;
    private String title;
    private int pageNumber;

    public Book(String title, Publisher publisher) {
        this.title = title;
        this.publisher = publisher;
        this.borrower = null;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public void setPageNumber(int n)
    {
        this.pageNumber = n;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void loanTo(String borrower) {
        this.borrower = borrower;
    }

    @Override
    public void returnBook() {
        this.borrower = null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publisher=" + publisher +
                ", borrower='" + borrower + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
