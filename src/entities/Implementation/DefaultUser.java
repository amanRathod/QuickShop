package entities.Implementation;

import entities.User;

import java.util.Objects;

public class DefaultUser implements User {
    private static int userCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    {
        id = ++userCounter;
    }

    public DefaultUser() {}
    public DefaultUser(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public void setEmail(String newEmail) {
        if (newEmail == null) return;
        this.email = email;
    }

    @Override
    public void setPassword(String password) {
        if (password == null) return;
        this.password = password;
    }

    void clearState() {
        userCounter = 0;
    }

    @Override
    public String toString() {
        return "New User is created [id = " + id + ", firstName = " + this.firstName + ", lastName = " + this.lastName + ", email = " + this.email + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.email);
    }

}
