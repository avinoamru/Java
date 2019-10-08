
public class CarSpeed {
// 	First method
	public void fullThrottle() {
		System.out.println("This car is going as fast as it can!");
	}
//	Second method
	public void speed(int maxSpeed) {
		System.out.println("The max speed is: " + maxSpeed);
	}
	
	public static void main(String[] args) {
//		Creating an object to call the methods
		CarSpeed cars = new CarSpeed();
		cars.fullThrottle();
		cars.speed(300);
		
		
	}

}
