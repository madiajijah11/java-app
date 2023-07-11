package library.service.transaction;

import java.util.List;

import library.model.Transaction;

public interface TransactionService {
  void createdBorrow(Transaction transaction);

  List<Transaction> getTransactions();

  void returningBook(Integer ID, Transaction transaction);
}
