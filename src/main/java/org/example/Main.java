package org.example;

public class Main {
    public static void main(String[] args) {

        Admin admin = new Admin();

        admin.username = "Giorgi";
        admin.email = "giorgi@gmail.com";

        admin.displayUserInfo();
        admin.deleteUser("");

    }
}