package org.example;

public class Admin extends User {

    public void deleteUser(String username) {
        if (!username.isEmpty()) {
            System.out.println("User deleted: " + username);
        } else {
            System.out.println("Invalid username");
        }
    }
}
