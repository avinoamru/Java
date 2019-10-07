

public class WideningDataType {

	public static void main(String[] args) {
//		Widening method
		int myAge = 30;
		double futureMyAge = myAge;
		myAge = 23;
//		will show 30 because the change made after the declaration of the double value
		System.out.println(futureMyAge);
		System.out.println(myAge);
		
	}

}
