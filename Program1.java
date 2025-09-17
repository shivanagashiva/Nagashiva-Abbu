
import java.util.Scanner;

public class Program1 {
    //basic calculator (+,-,*,/)

    public static void main(String[] args) {
        //taking inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number : ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter operation to perform (in +,-,/,*) : ");
        String operation = scanner.nextLine();
        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();
        scanner.close();
    }
}

class Calculator {
    double a;
    double b;
    String operation;
    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }
    public void calculate() {
        switch (operation) {
            //case for addition
            case "+":
                System.out.println("Addition of two numbers is : " + (a + b));
                break;
            //case for subtraction
            case "-":
                System.out.println("Subtraction of two numbers is : " + (a - b));
                break;
            //case for multiplication
            case "*":
                System.out.println("Multiplication of two numbers is : " + (a * b));
                break;
            //case for division
            case "/":
                if (b != 0) {
                    System.out.println("Division of two numbers is : " + (a / b));
                } else {
                    //handles exception 
                    System.out.println("Division by zero is not possible");
                }
                break;
            //if the symbol is invalid
            default:
                System.out.println("Invalid Symbol...Please enter the symbols mentioned above");
                break;

        }
    }

}
