package library.service.book;

import java.util.List;

import library.dao.BookDao;
import library.model.Book;

public class BookServiceImpl implements BookService {
  BookDao bookDao;

  public BookServiceImpl(BookDao bookDao) {
    this.bookDao = bookDao;
  }

  @Override
  public void createBook(Book book) {
    if (book.getTitle() == null || book.getPublisher() == null || book.getAuthor() == null) {
      throw new IllegalArgumentException("Title, publisher, and author are required!");
    }
    // save ke db
    bookDao.save(book);
  }

  @Override
  public Book getBook(Integer ID) {
    Book bookFindById = bookDao.findById(ID);
    if (bookFindById == null) {
      throw new NullPointerException("ID is not found!");
    }
    return bookFindById;
  }

  @Override
  public List<Book> getBooks() {
    List<Book> books = bookDao.findAll();
    if (books.size() == 0) {
      System.out.println("Book is empty!");
      return null;
    } else {
      return books;
    }
  }

  @Override
  public void updateBook(Integer ID, Book book) {
    Book bookFind = bookDao.findById(ID);
    if (bookFind == null) {
      throw new NullPointerException("ID is not found!");
    }

    // update
    if (book.getTitle() != "") {
      bookFind.setTitle(book.getTitle());
    }
    if (book.getPublisher() != "") {
      bookFind.setPublisher(book.getPublisher());
    }
    if (book.getAuthor() != "") {
      bookFind.setAuthor(book.getAuthor());
    }

    // save ke db
    bookDao.update(ID, bookFind);
  }

}
