package by.it.academy.domenikov.utils;

import java.util.Random;

public class CustomRandomEmailGenerator {

    public static String generateRandomEmail() {
        String[] domains = {"merepost.com","fextemp.com","rover.info","fexbox.org","fexpost.com","mailto.plus"};
        String username = generateRandomName(); // Updated method to generate a name
        String domain = domains[new Random().nextInt(domains.length)];

        return username + "@" + domain;
    }

    private static String generateRandomName() {
        String[] firstNames = {
                "John", "Jane", "Michael", "Emily", "David", "Emma", "Daniel", "Olivia", "Christopher", "Sophia",
                "Matthew", "Ava", "Andrew", "Mia", "Ethan", "Isabella", "William", "Sophie", "James", "Charlotte",
                "Alexander", "Amelia", "Benjamin", "Ella", "Nicholas", "Grace", "Jackson", "Lily", "Joseph", "Chloe",
                "Samuel", "Madison", "Ryan", "Abigail", "Nathan", "Avery", "Jonathan", "Zoe", "Christopher", "Aria",
                "Caleb", "Scarlett", "Luke", "Aubrey", "Isaac", "Hannah", "Owen", "Addison", "Henry", "Liam"
        };
        String[] lastNames = {
                "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
                "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
                "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King",
                "Wright", "Lopez", "Hill", "Scott", "Green", "Adams", "Baker", "Gonzalez", "Nelson", "Carter",
                "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards", "Collins"
        };

        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];
        String digits = String.valueOf(random.nextInt(900) + 100); // Generates a number between 100 and 999

        return decapitalize(firstName) + decapitalize(lastName) + digits;
    }

    private static String decapitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        String randomEmail = generateRandomEmail();
        System.out.println("Random Email: " + randomEmail);
    }
}