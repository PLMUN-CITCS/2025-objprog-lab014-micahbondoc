public class MethodReturnTypes {

    // Method to display a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }

    // Main method
    public static void main(String[] args) {
        // Display a welcome message
        displayWelcomeMessage();

        // Declare variables
        int value1 = 20;
        int value2 = 30;

        // Calculate the average
        double result = calculateAverage(value1, value2);

        // Display the result
        System.out.println("The average is: " + result);
    }
}
