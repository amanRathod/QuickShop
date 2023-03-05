package menu.implementation;

import config.ApplicationContext;
import entities.User;
import menu.Menu;
import services.Implementation.DefaultUserManagement;
import services.UserManagement;

import java.util.Scanner;

public class SignInMenu implements Menu {
    private UserManagement userManagementService;
    private ApplicationContext context;

    {
        userManagementService = DefaultUserManagement.getInstance();
        context = ApplicationContext.getInstance();
    }

    @Override
    public void start() {
        printMenuHeader();
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter your email: ");
        String userEmail = sc.next();

        System.out.print("Please, enter your password: ");
        String userPassword = sc.next();

        User user = userManagementService.getUserByEmail(userEmail);

        if (user != null && user.getPassword().equals(userPassword)) {
            System.out.printf("Glad to see you back %s %s", user.getFirstName(),
                    user.getLastName() + System.lineSeparator());
            context.setLoggedInUser(user);
        } else {
            System.out.println("Unfortunately, such login and password doesn't exist");
        }
//        context.getMainMenu().start();
    }

    @Override
    public void printMenuHeader() {
        System.out.println("***** SIGN IN *****");
    }
}
