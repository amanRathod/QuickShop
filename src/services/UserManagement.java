package services;

import entities.User;

public interface UserManagement {

    String registerUser(User user);

    User[] getUsers();

    User getUserByEmail(String userEmail);
}
