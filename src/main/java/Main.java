import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter command (e.g., add 5 3):");


        Boolean keepRunning = true;
        while (keepRunning) {
            String command = scanner.nextLine();
            String[] input = command.split(" ");
    
            String operation = input[0];
            switch (operation) {
                case "add":
                    System.out.println(calc.add(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "binary":
                    System.out.println(calc.intToBinaryNumber(Integer.parseInt(input[1])));
                    break;
                case "divide":
                    System.out.println(calc.divide(Integer.parseInt(input[1]), Integer.parseInt(input[2])));
                    break;
                case "fibonacci":
                    System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(input[1])));
                    break;
                case "quit":
                    keepRunning = false;
                default:
                    System.out.println("Unknown command.");
            }
        }
        

        scanner.close();
    }
    // test
}
