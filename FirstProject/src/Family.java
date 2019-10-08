
public class Family {
	/*============================
	 *         Field
	 =============================*/
	String dad = "Steve";
	String mom = "Jane";
	String son = "David";
	int age1 = 40;
	int age2 = 35;
	int age3 = 18;
	
	public static void main(String[] args) {
		
		Family entity1 = new Family();
		System.out.println("Dad's name is " + entity1.dad + " and he's " + entity1.age1 + " years old.");
		System.out.println("Mom's name is " + entity1.mom + " and she's " + entity1.age2 + " years old.");
		System.out.println("Son's name is " + entity1.son + " and he's " + entity1.age3 + " years old.");
		

	}

}
