import java.util.Scanner;

public class Calculator {
    public static void main (String[] args){
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);
        Scanner inputSymbol = new Scanner(System.in);
        System.out.println("This is a calculator, please follow the steps.");

        System.out.print("Enter 1st number: ");
        int num1 = inputNum1.nextInt();

        System.out.print("Enter Symbol: ");
        char symbol = inputSymbol.next().charAt(0);

        System.out.print("Enter 2nd number: ");
        int num2 = inputNum2.nextInt();

        switch (symbol){
            case '+':
                System.out.print(num1 + num2);
                break;

            case '-':
                System.out.print(num1 - num2);
                break;

            case '*':
                System.out.print(num1 * num2);
                break;

            case '/':
                System.out.print(num1 / num2);
                break;

        }

    }
}
