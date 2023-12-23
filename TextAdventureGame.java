import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");

        // Start the game
        startGame(scanner);

        scanner.close(); // Close the scanner at the end
    }

    public static void startGame(Scanner scanner) {
        System.out.println("\nYou find yourself in a mysterious forest...");

        // Initial decision point
        System.out.println("What would you like to do?");
        System.out.println("1. Go deeper into the forest");
        System.out.println("2. Search for a way out");

        int decision = getUserChoice(scanner, 2); // Allowing choices 1 or 2

        if (decision == 1) {
            // Outcome based on the first choice
            deeperIntoForest(scanner);
        } else {
            // Outcome based on the second choice
            searchForWayOut(scanner);
        }
    }

    public static void deeperIntoForest(Scanner scanner) {
        System.out.println("\nYou venture deeper into the forest...");

        // More storyline and decisions
        System.out.println("You encounter a cave. What will you do?");
        System.out.println("1. Enter the cave");
        System.out.println("2. Continue exploring the forest");

        int decision = getUserChoice(scanner, 2); // Allowing choices 1 or 2

        if (decision == 1) {
            // Outcome based on entering the cave
            enterCave(scanner);
        } else {
            // Outcome based on continuing to explore
            continueExploringForest(scanner);
        }
    }

    public static void enterCave(Scanner scanner) {
        System.out.println("\nYou enter the dark cave...");

        // More story and decisions inside the cave
        System.out.println("Inside the cave, you see two paths. Which one do you choose?");
        System.out.println("1. Take the left path");
        System.out.println("2. Take the right path");

        int decision = getUserChoice(scanner, 2); // Allowing choices 1 or 2

        if (decision == 1) {
            // Outcome based on the left path
            leftPathOutcome(scanner);
        } else {
            // Outcome based on the right path
            rightPathOutcome(scanner);
        }
    }

    public static void leftPathOutcome(Scanner scanner) {
        System.out.println("\nYou chose the left path...");

        // Outcome of choosing the left path
        System.out.println("You find a treasure chest! What do you do?");
        System.out.println("1. Open it");
        System.out.println("2. Leave it and continue");

        int decision = getUserChoice(scanner, 2); // Allowing choices 1 or 2

        if (decision == 1) {
            // Outcome of opening the treasure chest
            openTreasureOutcome(scanner);
        } else {
            // Outcome of leaving the treasure chest
            System.out.println("\nYou decide to leave the chest and continue.");
            // Game can continue with more story...
        }
    }

    public static void rightPathOutcome(Scanner scanner) {
        System.out.println("\nYou chose the right path...");

        // Outcome of choosing the right path
        System.out.println("You encounter a group of creatures...");
        System.out.println("1. Try to communicate");
        System.out.println("2. Retreat quietly");

        int decision = getUserChoice(scanner, 2); // Allowing choices 1 or 2

        if (decision == 1) {
            // Outcome of trying to communicate
            communicateWithCreaturesOutcome(scanner);
        } else {
            // Outcome of retreating quietly
            retreatQuietlyOutcome(scanner);
        }
    }

    public static void searchForWayOut(Scanner scanner) {
        System.out.println("\nYou start searching for a way out...");

        // More story and decisions for searching a way out
        //...

        System.out.println("This part of the story is under construction!");
        // You can continue building the story and outcomes
    }

    public static void continueExploringForest(Scanner scanner) {
        System.out.println("\nYou continue exploring the forest...");

        // More story and decisions for exploring the forest
        //...

        System.out.println("This part of the story is under construction!");
        // You can continue building the story and outcomes
    }

    public static void openTreasureOutcome(Scanner scanner) {
        System.out.println("\nYou open the treasure chest...");

        // Outcome of opening the treasure chest
        //...

        System.out.println("This part of the story is under construction!");
        // You can continue building the story and outcomes
    }

    public static void communicateWithCreaturesOutcome(Scanner scanner) {
        System.out.println("\nYou try to communicate with the creatures...");

        // Outcome of trying to communicate with creatures
        //...

        System.out.println("This part of the story is under construction!");
        // You can continue building the story and outcomes
    }

    public static void retreatQuietlyOutcome(Scanner scanner) {
        System.out.println("\nYou retreat quietly...");

        // Outcome of retreating quietly from creatures
        //...

        System.out.println("This part of the story is under construction!");
        // You can continue building the story and outcomes
    }

    // Helper method to get user choice within a range
    public static int getUserChoice(Scanner scanner, int maxChoice) {
        int choice;
        while (true) {
            try {
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= maxChoice) {
                    break;
                } else {
                    System.out.println("Invalid choice! Please enter a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        return choice;
    }
}
