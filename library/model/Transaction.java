package library.model;

import java.util.Date;

public class Transaction {
  private Book book;
  private User user;
  private Date createdAt;
  private Date updatedAt;

  // constructor
  public Transaction(Book book, User user, Date createdAt, Date updatedAt) {
    this.book = book;
    this.user = user;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  // setter and getter
  public Book getBook() {
    return this.book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public User getUser() {
    return this.user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Date createdAt() {
    return this.createdAt;
  }

  public void createdAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date updatedAt() {
    return this.updatedAt;
  }

  public void updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  // get information
  public void getInfo() {
    System.out.println(
        "{ book: " + this.book.toString() + ", user: " + this.user.toString() + ", createdAt: " + this.createdAt
            + ", updatedAt: " + this.updatedAt + " }");
  }
}
