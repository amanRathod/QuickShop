package config;

import entities.User;

public class ApplicationContext {
    private static ApplicationContext instance;
    private User loggedInUser;

    public static ApplicationContext getInstance() {
        if (instance == null) {
            instance = new ApplicationContext();
        }
        return instance;
    }

    public void setLoggedInUser(User user) {
        this.loggedInUser = user;
    }

    public User getLoggedInUser() {
        return this.loggedInUser;
    }
}
