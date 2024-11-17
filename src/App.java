import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user for subtotal and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        
        // Read the user input for subtotal and gratuity rate
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // Calculate the gratuity
        double gratuity = subtotal * gratuityRate / 100;

        // Calculate the total
        double total = subtotal + gratuity;

        // Display the results
        System.out.printf("The gratuity is $%.2f and total is $%.2f%n", gratuity, total);
        
        // Close the scanner to prevent resource leak
        input.close();
    }
}
