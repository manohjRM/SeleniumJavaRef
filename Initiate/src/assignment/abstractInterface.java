package assignment;

interface food1{
	void menu1list();
	int menu1(int x);
	void menu2();
	//void menu3();
}

abstract class free_food implements food1{
	public abstract int menu1(int x);
	public void menu1list() {
		System.out.println("menu1 list");
	}
	void menu3() {
		System.out.println("3");
	}
}

class person1 extends free_food{
	public int menu1(int x) {
		System.out.println(x);
		return 0;
	}
	public void menu2() {
		
	}
	int menu3(int y) {
		System.out.println("4");
		return 0;
	}
}

public class abstractInterface {

	public static void main(String[] args) {
		food1 obj1 = new person1();
		obj1.menu1list();
		obj1.menu1(5);
		free_food obj2 = new person1();
		obj2.menu1list();
		obj2.menu1(6);
		//food1 obj3 = new free_food();
		obj2.menu3();
		person1 obj3 = new person1();
		obj3.menu3(6);
	}

}
