package by.it.academy.domenikov.utils;

import java.util.Random;

public class CustomRandomLastNameGenerator {
    public static String generateRandomLastName() {
        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
                "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
                "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King",
                "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter",
                "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins"
        };

        int randomIndex = new Random().nextInt(lastNames.length);
        return lastNames[randomIndex];
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(); // Generates a random integer
    }

    public static void main(String[] args) {
        String randomLastName = "Test" + generateRandomLastName() + generateRandomInt();
        System.out.println("Random First Name: " + randomLastName);
    }
}