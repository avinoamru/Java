import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Please enter your name: ");

        String name = inputName.next();
        System.out.println("Nice to meet you " + name + " :-)");

        Scanner inputAge = new Scanner(System.in);
        System.out.print("How old are you?");
        int age = inputAge.nextInt();
        if (age >= 65){
            System.out.print("Your'e old");
        }else if (age >= 40){
            System.out.print("Getting older");
        }else if (age < 23){
            System.out.print("You are younger than me");
        }else if (age == 23){
            System.out.print("We are the same age!!");
        }else{
            return;
        }


    }
}
