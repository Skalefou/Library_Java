package org.example;

public interface Loanable {
    void loanTo(String borrower);
    void returnBook();
    String getBorrower();
}
