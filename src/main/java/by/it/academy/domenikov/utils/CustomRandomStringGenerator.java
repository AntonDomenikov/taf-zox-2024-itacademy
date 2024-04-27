package by.it.academy.domenikov.utils;

import java.util.Random;

public class CustomRandomStringGenerator {

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int length = 20; // Define the length of the random string
        String randomString = "Test Text - Please Ignore this " + generateRandomString(length);
        System.out.println("Random String: " + randomString);
    }
}