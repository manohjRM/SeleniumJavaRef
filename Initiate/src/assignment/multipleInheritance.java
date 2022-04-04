package assignment;

interface animal{
	void A_dog();
	void A_cat();
}

interface dogAnimal extends animal{
	void B_dog();
}

interface catAnimal extends animal{
	default void B_cat() {
		System.out.println("This is B_cat method");
	}
}

interface catdog extends dogAnimal, catAnimal{
	void catDog();
}

class dog1 implements dogAnimal{
	public void A_dog(){
		System.out.println("This is A_Dog method");
	}
	public void A_cat() {
		System.out.println("This is A_cat method");
	}
	public void B_dog() {
		System.out.println("This is B_dog method");
	}
} 

class cat1 implements catAnimal{
	public void A_cat() {
		System.out.println("This is A_cat method");
	}
	public void A_dog(){
		System.out.println("This is A_Dog method");
	}
}

public class multipleInheritance {
	public static void main(String[] args) {
		animal obj1 = new dog1();
		obj1.A_dog();
		obj1.A_cat();
		animal obj2 = new cat1();
		obj2.A_cat();
		obj1.A_dog();
		dogAnimal obj3 = new dog1();
		catAnimal obj4 = new cat1();
		obj3.B_dog();
		obj4.B_cat();
	}
}