
public class CheckingFinal {
//	final is like const in JS, you can't change the value of the variable after its assigned.
	
//	final variable will be written in capital LETTERS!!!!!!!
	final double INTEREST = 3.92;

	public static void main(String[] args) {
		
		CheckingFinal newInterest = new CheckingFinal();
		newInterest.INTEREST = 4.12;
		
		System.out.println(newInterest.INTEREST);
		
		
		
		
	}

}
