
public class TryAndCatch {

	public static void main(String[] args) {
		try { int[] numberB = {1,2,3,4,5};
		System.out.println(numberB[2]);
		}
		catch (Exception e) {
			System.out.println("there is an out of bound error");
		}
//		adding finally code block
		finally {
			System.out.println("whatever happens it sould show this line");
		}
	}
}
