package com.himik;

import java.io.IOException;

public class BookTrackerRunner {

    public static void runBookTracker() throws IOException {
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
        mainMenu.getUserInput();
    }
}
