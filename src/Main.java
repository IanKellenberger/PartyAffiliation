import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String affiliation = scanner.nextLine().toUpperCase(); // Read the input and convert to uppercase

        if (affiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (affiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (affiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}