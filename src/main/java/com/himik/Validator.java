package com.himik;

public class Validator {

    public static boolean validateMainMenuUserInput(String userInput) {
        char[] validInputs = {'1', '2', '3', '4', '5', '6', '7'};

        if (userInput.length() == 1) {
            for (char input : validInputs) {
                if (userInput.charAt(0) == input) {
                    return true;
                }
            }
        }

        return false;
    }
}
