class Robot {
	
	 public void speak(String text) {
		 System.out.println(text);
	 }
	 
	 public void jump(int height) {
		 System.out.println("Jumping : " + height);
	 }
	 
	 public void move(String direction, double distance) {
		 System.out.println("Moving " + distance + " in direction " + direction);
	 } 
	 
	 
	 
}


public class ClassParameters {
	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("hI I'm Sam");
		sam.jump(7);
		sam.move("Up", 5.9);
		
		String greeting="hello";
		sam.speak(greeting);
	}
}
