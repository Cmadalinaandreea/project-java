class Person {
	//instance variables
	String name;
	int age;
	//data
	//subrutines(methods)
	
	void speak() {
		for (int i=0; i<3;i++) {
		System.out.println("My name is " + name + " and I am " + age + " years old ");
		}
	}
	
	void sayHello() {
		System.out.println("Hello There");
	}
	
	int calculateYearsToRetirment() {
		int yearsLeft = 65 - age;
		
		
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
}

class Frog {
	private String name;
	private int age;
	
	public Frog() {
		System.out.println("Constructor");
		name = "Arnie";	
	}
	
	public Frog(String name) {
		System.out.println("Second constructor");
		this.name=name;
	}
	
	
	public Frog(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}




public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Mihai";
		person1.age = 25;
		person1.speak();
		person1.sayHello();
		int years = person1.calculateYearsToRetirment();
		System.out.println("Years till retirement " + years);
		Person person2 = new Person();
		person2.name = "Darius";
		person2.age = 38;
		person2.speak();
		person1.calculateYearsToRetirment();
		
		int age = person1.getAge();
		String name = person1.getName();
		
		System.out.println(" age : " + age);
		
		
		Frog frog1=new Frog();
		
		
		
		frog1.setName("Bertie");
		frog1.setAge(7);
		
		System.out.println(frog1.getName() + " " + frog1.getAge() );
		
		Frog frog2=new Frog("Bertie");
	
	
	}

}
