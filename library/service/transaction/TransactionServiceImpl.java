package library.service.transaction;

import java.util.List;

import library.dao.TransactionDao;
import library.model.Transaction;

// Date
import java.util.Date;

public class TransactionServiceImpl implements TransactionService {
  TransactionDao transactionDao;

  public TransactionServiceImpl(TransactionDao transactionDao) {
    this.transactionDao = transactionDao;
  }

  @Override
  public List<Transaction> getTransactions() {
    List<Transaction> transactions = transactionDao.findAll();
    if (transactions.size() == 0) {
      System.out.println("Transaction is empty!");
      return null;
    } else {
      return transactions;
    }
  }

  @Override
  public void returningBook(Integer ID, Transaction transaction) {
    Transaction transactionFind = transactionDao.findById(ID);
    if (transactionFind == null) {
      throw new NullPointerException("ID is not found!");
    }

    // Date
    Date date = new Date();
    transactionFind.updatedAt(date);

    // save ke db
    transactionDao.update(ID, transactionFind);
  }

  @Override
  public void createdBorrow(Transaction transaction) {
    transactionDao.save(transaction);
  }
}
