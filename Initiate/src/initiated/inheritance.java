package initiated;

class Animal{
	void sound1(){
		System.out.println("Barks");
	}
}

class cat extends Animal{
	void sound2() {
		System.out.println("Meow");
	}
}

class dog extends cat{
	void sound3() {
		System.out.println("sound");
	}
}

public class inheritance extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat ob = new cat();
		ob.sound1();
		ob.sound2();
		dog ob2 = new dog();
		ob2.sound3();
		ob2.sound1();
		ob2.sound2();
		inheritance ob3 = new inheritance();
		ob3.sound1();
	}

}
