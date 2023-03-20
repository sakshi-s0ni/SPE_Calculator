package org.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculate {
    private static final Logger logger = LogManager.getLogger(Calculate.class);
    public Calculate(){
    }
    public static void main(String[] args) {

        Calculate calculator = new Calculate();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scientific Calculator using DevOps.");
        do {
            System.out.println("Choose from the following operations - ");
            System.out.println("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit");

            int choice;

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            double number1, number2;
            int num;
            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter a number : ");
                    num = scanner.nextInt();
                    System.out.println("Factorial of "+num+" is : " + calculator.factorial(num));
                    System.out.println("\n");

                    break;
                case 2:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + calculator.squareRoot(number1));
                    System.out.println("\n");


                    break;
                case 3:
                    // Power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // Natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural log of "+number1+" is : " + calculator.naturalLog(number1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Hope to see you soon! Adios!");
                    return;
            }
        } while (true);
}

    public double factorial(int num) {
        logger.info("[FACTORIAL] - " + num);
        double result = fact(num);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double squareRoot(double num) {
        logger.info("[SQ ROOT] - " + num);
        double result = Math.sqrt(num);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double num) {
        logger.info("[NATURAL LOG] - " + num);
        double result = 0;
        try {

            if (num <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public double fact(int num) {
        double f = 1;
        for(int i = 1; i <= num; ++i)
        { f *= i;   }
        return  f;
    }

}