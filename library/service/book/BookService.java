package library.service.book;

import java.util.List;

import library.model.Book;

public interface BookService {
  void createBook(Book book);

  Book getBook(Integer ID);

  List<Book> getBooks();

  void updateBook(Integer ID, Book book);
}
