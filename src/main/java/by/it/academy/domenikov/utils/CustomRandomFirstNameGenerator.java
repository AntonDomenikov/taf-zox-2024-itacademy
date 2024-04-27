package by.it.academy.domenikov.utils;

import java.util.Random;

public class CustomRandomFirstNameGenerator {

    public static String generateRandomFirstName() {
        String[] firstNames = {
                "John", "Jane", "Michael", "Emily", "David", "Emma", "Daniel", "Olivia", "Christopher", "Sophia",
                "Matthew", "Ava", "Andrew", "Mia", "Ethan", "Isabella", "William", "Sophie", "James", "Charlotte",
                "Alexander", "Amelia", "Benjamin", "Ella", "Nicholas", "Grace", "Jackson", "Lily", "Joseph", "Chloe",
                "Samuel", "Madison", "Ryan", "Abigail", "Nathan", "Avery", "Jonathan", "Zoe", "Christopher", "Aria",
                "Caleb", "Scarlett", "Luke", "Aubrey", "Isaac", "Hannah", "Owen", "Addison", "Henry", "Liam"
        };

        int randomIndex = new Random().nextInt(firstNames.length);
        return firstNames[randomIndex];
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(); // Generates a random integer
    }

    public static void main(String[] args) {
        String randomFirstName = "Test" + generateRandomFirstName() + generateRandomInt();
        System.out.println("Random First Name: " + randomFirstName);
    }
}