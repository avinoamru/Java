
public class CallingMethod {

//	will define a static method
	void sayWeather (){
		System.out.println("Finally today we don't have rain.");
		
	}
	
	public static void main(String[] args) {
		CallingMethod call = new CallingMethod();
		call.sayWeather();
		

	}

}
