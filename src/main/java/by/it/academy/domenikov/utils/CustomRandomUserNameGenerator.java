package by.it.academy.domenikov.utils;

import java.util.Random;


public class CustomRandomUserNameGenerator {
    public static String generateRandomUserName() {
        String[] usernames = {
                "Ace", "Doc", "Flash", "Maverick", "Spike", "Vegas", "Rocket", "Shadow", "Gizmo", "Tank",
                "Blaze", "Dash", "Razor", "Frost", "Thunder", "Wizard", "Viper", "Cobra", "Phoenix", "Hawk",
                "Wolf", "Falcon", "Tiger", "Saber", "Lynx", "Grizzly", "Rhino", "Jaguar", "Panther", "Raptor",
                "Viking", "Pirate", "Knight", "Ninja", "Samurai", "Wizard", "Zephyr", "Orion", "Atlas", "Apollo"
        };

        int randomIndex = new Random().nextInt(usernames.length);
        String username = usernames[randomIndex];
        String threeDigits = String.valueOf(generateRandomInt());

        return username + threeDigits;
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(900) + 100; // Generates a random integer between 100 and 999
    }

    public static void main(String[] args) {
        String randomUsername = generateRandomUserName();
        System.out.println("Random Username: " + randomUsername);
    }
}