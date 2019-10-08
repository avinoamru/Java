
public class ConstructorParameter {
//	Field
	int modelYear;
	String modelName;
	/*other option to define Field to constructor parameter:
	 * int year;
	 * String name;
 // And in constructor do:
	 * this.year = year;
	 * this.name = name;
	 * */
//	Creating constructor with 2 parameters
	public ConstructorParameter(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		ConstructorParameter obj1 = new ConstructorParameter(1969,"Musteng");
	
		
		
		System.out.println("The model of the car is: " + obj1.modelName + ", and the model year is: " + obj1.modelYear);
		

	}

}
