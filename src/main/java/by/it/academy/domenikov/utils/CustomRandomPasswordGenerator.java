package by.it.academy.domenikov.utils;

import java.util.Random;

public class CustomRandomPasswordGenerator {

    public static String generateRandomPassword(int length) {
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+";
        String combinedChars = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            password.append(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 10; // You can set your desired password length
        String randomPassword = generateRandomPassword(passwordLength);
        System.out.println("Random Password: " + randomPassword);

    }
}