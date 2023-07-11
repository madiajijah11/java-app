package library.service.user;

import java.util.List;

import library.model.User;

public interface UserService {
  void createUser(User user);

  User getUser(Integer id);

  List<User> getUsers();

  void updateUser(Integer id, User user);
}
