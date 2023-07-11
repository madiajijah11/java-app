package library;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import library.dao.BookDao;
import library.dao.TransactionDao;
import library.dao.UserDao;
import library.model.Book;
import library.model.Transaction;
import library.model.User;
import library.service.book.BookService;
import library.service.book.BookServiceImpl;
import library.service.transaction.TransactionService;
import library.service.transaction.TransactionServiceImpl;
import library.service.user.UserService;
import library.service.user.UserServiceImpl;

public class Main {
  static UserDao userDao = new UserDao();
  static UserService userService = new UserServiceImpl(userDao);
  static BookDao bookDao = new BookDao();
  static BookService bookService = new BookServiceImpl(bookDao);
  static TransactionDao transactionDao = new TransactionDao();
  static TransactionService transactionService = new TransactionServiceImpl(transactionDao);

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    try {
      String opsi;
      do {
        User user;
        Book book;
        Transaction transaction;

        System.out.println("===== MENU SISTEM =====");
        // Menu List
        System.out.println("1. Input User");
        System.out.println("2. Tampilkan User");
        System.out.println("3. Perbarui Data User");
        System.out.println("4. Input Buku");
        System.out.println("5. Tampilkan Buku");
        System.out.println("6. Perbarui Data Buku");
        System.out.println("7. Input Transaksi");
        System.out.println("8. Tampilkan Transaksi");
        System.out.println("9. Pengembalian Buku");
        System.out.println("=======================");

        System.out.print("Input menu: ");
        String menu = in.nextLine();

        switch (menu) {
          case "1":
            System.out.println("INPUT USER");
            user = new User("", "", "");
            System.out.print("Input email: ");
            user.setEmail(in.nextLine());
            System.out.print("Input full name: ");
            user.setFullname(in.nextLine());
            System.out.print("Input password: ");
            user.setPassword(in.nextLine());
            userService.createUser(user);
            System.out.println();
            break;

          case "2":
            System.out.println("TAMPILKAN USER");
            List<User> users = userService.getUsers();
            for (int i = 0; i < users.size(); i++) {
              System.out.print((i + 1) + ". ");
              User u = users.get(i);
              u.getInfo();
            }
            System.out.println();
            break;

          case "3":
            System.out.println("PERBARUI DATA USER");
            System.out.println("TAMPILKAN USER");
            List<User> users2 = userService.getUsers();
            for (int i = 0; i < users2.size(); i++) {
              System.out.print((i + 1) + ". ");
              User u = users2.get(i);
              u.getInfo();
            }
            System.out.println();
            System.out.println("INPUT USER");
            user = new User("", "", "");
            System.out.print("Input id user: ");
            int id = Integer.valueOf(in.nextLine());
            System.out.print("Input email: ");
            user.setEmail(in.nextLine());
            System.out.print("Input full name: ");
            user.setFullname(in.nextLine());
            System.out.print("Input password: ");
            user.setPassword(in.nextLine());

            // service
            userService.updateUser(id, user);
            System.out.println();
            break;

          case "4":
            System.out.println("INPUT BUKU");
            book = new Book("", "", "");
            System.out.print("Input judul: ");
            book.setTitle(in.nextLine());
            System.out.print("Input penerbit: ");
            book.setPublisher(in.nextLine());
            System.out.print("Input penulis: ");
            book.setAuthor(in.nextLine());
            bookService.createBook(book);
            System.out.println();
            break;

          case "5":
            System.out.println("TAMPILKAN BUKU");
            List<Book> books = bookService.getBooks();
            for (int i = 0; i < books.size(); i++) {
              System.out.print((i + 1) + ". ");
              Book b = books.get(i);
              b.getInfo();
            }
            System.out.println();
            break;

          case "6":
            System.out.println("PERBARUI DATA BUKU");
            System.out.println("TAMPILKAN BUKU");
            List<Book> books2 = bookService.getBooks();
            for (int i = 0; i < books2.size(); i++) {
              System.out.print((i + 1) + ". ");
              Book b = books2.get(i);
              b.getInfo();
            }
            System.out.println();
            System.out.println("INPUT BUKU");
            book = new Book("", "", "");
            System.out.print("Input id buku: ");
            int id2 = Integer.valueOf(in.nextLine());
            System.out.print("Input judul: ");
            book.setTitle(in.nextLine());
            System.out.print("Input penerbit: ");
            book.setPublisher(in.nextLine());
            System.out.print("Input penulis: ");
            book.setAuthor(in.nextLine());

            // service
            bookService.updateBook(id2, book);
            System.out.println();
            break;

          case "7":
            System.out.println("INPUT TRANSAKSI");
            // show the list of book
            System.out.println("TAMPILKAN BUKU");
            List<Book> books3 = bookService.getBooks();
            for (int i = 0; i < books3.size(); i++) {
              System.out.print((i + 1) + ". ");
              Book b = books3.get(i);
              b.getInfo();
            }
            // show the list of user
            System.out.println("TAMPILKAN USER");
            List<User> users3 = userService.getUsers();
            for (int i = 0; i < users3.size(); i++) {
              System.out.print((i + 1) + ". ");
              User u = users3.get(i);
              u.getInfo();
            }
            // prompt user to input userId and bookId
            System.out.print("Input book ID: ");
            int bookId = Integer.parseInt(in.nextLine());
            System.out.print("Input user ID: ");
            int userId = Integer.parseInt(in.nextLine());

            // retrieve user and book objects from database
            User user1 = userService.getUser(userId);
            Book book1 = bookService.getBook(bookId);

            // create new transaction object
            Date createdAt = new Date();
            Date updatedAt = new Date();
            transaction = new Transaction(book1, user1, createdAt, updatedAt);

            // save transaction to database
            transactionService.createdBorrow(transaction);

            System.out.println("Transaksi berhasil dibuat!");
            System.out.println();
            break;

          case "8":
            System.out.println("TAMPILKAN TRANSAKSI");
            List<Transaction> transactions = transactionService.getTransactions();
            for (int i = 0; i < transactions.size(); i++) {
              System.out.print((i + 1) + ". ");
              Transaction t = transactions.get(i);
              t.getInfo();
            }
            System.out.println();
            break;

          case "9":
            System.out.println("PENGEMBALIAN BUKU");
            System.out.println("TAMPILKAN TRANSAKSI");
            List<Transaction> transactions2 = transactionService.getTransactions();
            for (int i = 0; i < transactions2.size(); i++) {
              System.out.print((i + 1) + ". ");
              Transaction t = transactions2.get(i);
              t.getInfo();
            }
            System.out.println();
            System.out.print("Input transaction ID: ");
            int transactionId = Integer.parseInt(in.nextLine());

            // retrieve transaction object from database
            transaction = transactionService.getTransactions().get(transactionId - 1);

            // update transaction object
            transactionService.returningBook(transactionId, transaction);

            System.out.println("Buku berhasil dikembalikan!");
            System.out.println();
            break;

          default:
            break;
        }

        System.out.print("\nApakah mau keluar sistem? (y|n): ");
        opsi = in.nextLine();
        System.out.println();
      } while (opsi.equalsIgnoreCase("n"));

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      in.close();
    }
  }
}
