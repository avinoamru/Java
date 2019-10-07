import java.util.Scanner;

public class Factorial {
    @SuppressWarnings("resource")
	public static void main (String[] args){
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Enter number: ");
        long num = inputNum.nextLong();
        long i;
        for(i = num-1; i >= 1; i--){
            num *= i;
        }
        System.out.print("The factorial numer is: " + num);
    }
}
