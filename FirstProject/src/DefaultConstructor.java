
public class DefaultConstructor {
	
// 	Define field
	int x;
	int y;
	
//	Initialize variable 
	public DefaultConstructor() {
		x = 10;
		y = 3;
	}
	public static void main(String[] args) {
//  create object and call
		DefaultConstructor name = new DefaultConstructor();		
		System.out.println(name.x +" " + name.y);
		
	}

}
