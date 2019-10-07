
public class ArrayList {

	public static void main(String[] args) {
//		Defining the data type of the ArrayList
		java.util.ArrayList<String> cars = new java.util.ArrayList<String>();
//		Adding elements
		cars.add("Tesla");
		cars.add("honda");
		cars.add("Benz");
		cars.add("lambo");
		cars.add("Toyota");
		cars.set(0, "Musteng");
		cars.remove(1);
//		cars.clear();
		
//		Showing the output ArrayList
		System.out.println(cars.size());
		
	}

}
