
public class ThrowMethod2 {
	static void checkAge(int age) {
		if (age < 19) {
			throw new ArithmeticException("Access denied- you are to young to drink");
		}else {
			System.out.println("You are ok to drink");
		}
	}
	
	public static void main(String[] args) {
		checkAge(100);
	}
	
}
