
public class Animal {

	public void makeSound() {
		System.out.println("Animal makes sound");
	}
	
	public class pig extends Animal{
		
		public  makeSound() {
			System.out.println("Pig says: oink oink");
		}
	}
	
	public class dog extends Animal{
		public  makeSound() {
			System.out.println("Dog says: woof woof");
		}
	}
	
	
	public static void main(String[] args) {
		Animal.pig pigSay = new Animal.pig();
		
		System.out.println(pigSay.makeSound());
		
	}
}
