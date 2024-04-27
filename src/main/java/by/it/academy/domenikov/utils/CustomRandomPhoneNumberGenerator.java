package by.it.academy.domenikov.utils;

import java.util.Random;

public class CustomRandomPhoneNumberGenerator {
    public static String generateRandomPhoneNumber() {
        Random random = new Random();

        // Ensure that the first digit is between 2 and 9 to comply with typical phone number rules
        int firstDigit = random.nextInt(8) + 2;

        // Generate the remaining 9 digits
        StringBuilder phoneNumber = new StringBuilder(String.valueOf(firstDigit));
        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        return phoneNumber.toString();
    }

    public static void main(String[] args) {
        String randomPhoneNumber = generateRandomPhoneNumber();
        System.out.println("Random Phone Number: " + randomPhoneNumber);
    }
}