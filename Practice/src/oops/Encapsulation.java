package oops;

public class Encapsulation {
	private String name="Manoj";
	private String job="Engineer";
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setJob(String job) {
		this.job=job;
	}
	
	public String getJob() {
		return job;
	}
	String displayDetails() {
		name = "Sakthi";
		return name+job;
	}
	
	public static void main(String[] args) {
		Encapsulation ob = new Encapsulation();
		ob.displayDetails();
		ob.setName("Manoj Kumar");
		System.out.println(ob.getName());
		ob.setJob("Senior Engineer");
		System.out.println(ob.getJob());
		
		System.out.println(ob.name);
	}
}
