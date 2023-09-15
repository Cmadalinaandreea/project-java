class Person {
	//instance variables
	String name;
	int age;
	//data
	//subrutines(methods)
}

class Castraveti {
	String nume;
	int kg;
	String tara;
	double pret;
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Caca";
		person1.age =2;
		
		Person person2 = new Person();
		person2.name = "Da";
		person2.age = 3;
		
		System.out.println(person1.name);
		
		Castraveti castravet1 = new Castraveti();
		castravet1.nume="caca";
		castravet1.kg= 2;
		castravet1.tara="Romania";
		castravet1.pret = 2.8;
		
		System.out.println(castravet1.nume);
		System.out.println(castravet1.kg);
		System.out.println(castravet1.tara);
		System.out.println(castravet1.pret);
	}

}
