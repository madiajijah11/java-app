package library.dao;

import java.util.ArrayList;
import java.util.List;

import library.model.Transaction;
import library.service.BaseDao;

public class TransactionDao implements BaseDao<Transaction, Integer> {
  List<Transaction> transactions = new ArrayList<>();

  @Override
  public void save(Transaction data) {
    transactions.add(data);
  }

  @Override
  public void update(Integer id, Transaction data) {
    transactions.set(id - 1, data);
  }

  @Override
  public void remove(Integer id) {
    transactions.remove(id - 1);
  }

  @Override
  public List<Transaction> findAll() {
    return this.transactions;
  }

  @Override
  public Transaction findById(Integer id) {
    return transactions.get(id - 1);
  }

}
