package services.Implementation;

import entities.User;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class DefaultUserManagement implements services.UserManagement {
    private static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is already used by another user. Please, use another email";
    private static final String EMPTY_EMAIL_ERROR_MESSAGE = "You have to input email to register. Please, try one more time";
    private static final String NO_ERROR_MESSAGE = "";
    private static int DEFAULT_USER_CAPACITY = 10;
    private static DefaultUserManagement instance;
    private User[] users;
    private int lastUserIndex;

    {
        users = new User[DEFAULT_USER_CAPACITY];
    }

    private DefaultUserManagement() {
    }

    @Override
    public String registerUser(User user) {
        if (user == null) return NO_ERROR_MESSAGE;

        String errorMessage = checkUniqueEmail(user.getEmail());
        if (errorMessage != null && !errorMessage.isEmpty()) {
            return errorMessage;
        }

        if (users.length <= lastUserIndex) {
            users = Arrays.copyOf(users, users.length << 1);
        }

        users[lastUserIndex++] = user;
        return NO_ERROR_MESSAGE;
    }

    private String checkUniqueEmail(String email) {
        boolean hasDuplicate = Arrays.stream(users)
                .filter(user -> user != null && user.getEmail() != null)
                .anyMatch(user -> user.getEmail().equalsIgnoreCase(email));

        return hasDuplicate ? NOT_UNIQUE_EMAIL_ERROR_MESSAGE : NO_ERROR_MESSAGE;
    }

    @Override
    public User[] getUsers() {
        return Arrays.stream(users)
                .filter(Objects::nonNull)
                .toArray(User[]::new);
    }

    @Override
    public User getUserByEmail(String userEmail) {
        Optional<User> currUser = Arrays.stream(users)
                .filter(user -> user != null && user.getEmail().equalsIgnoreCase(userEmail))
                .findFirst();

        return currUser.orElse(null);
    }

    public static DefaultUserManagement getInstance() {
        if (instance == null) {
            instance = new DefaultUserManagement();
        }
        return instance;
    }

}
