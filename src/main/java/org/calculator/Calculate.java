package org.calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculate {
    public Calculate(){
    }
    public static void main(String[] args) {

        Calculate calculator = new Calculate();
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.println("Scientific Calculator using DevOps.");
        System.out.println("Enter values to add.");
        System.out.print("Enter a number1 : ");
        number1 = scanner.nextInt();
        System.out.print("Enter a number2 : ");
        number2 = scanner.nextInt();
        System.out.println("Addition of "+number1+" "+number2+" is : " + calculator.addition(number1,number2));
        System.out.println("\n");
    }


    public double addition(int number1, int number2) {
        double result = Math.addExact(number1,number2);
        return result;
    }
}