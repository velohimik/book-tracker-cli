package com.himik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public String getUserInput() throws IOException {
        String userChoice = "";
        while (!Validator.validateMainMenuUserInput(userChoice)) {
            System.out.println("Please, enter the number from 1 to 7:");
            userChoice = bufferedReader.readLine().trim();
        }

        return userChoice;
    }

    public void showMainMenu() {
        System.out.println("""
            \n===============Welcome to Book Tracker!===============
            
            Choose an option:
                1. Add a new book
                2. View all books
                3. Update book status
                4. Search books
                5. Delete a book
                6. Show statistics
                7. Save & Exit
            """);
    }
}
