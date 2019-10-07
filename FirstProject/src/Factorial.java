import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = inputNum.nextInt();
        int i;
        for(i = num-1; i >= 1; i--){
            num *= i;
        }
        System.out.print("The factorial numer is: " + num);
    }
}
