
public abstract class Animal {
	
	int age;
	String gender;
	int weight;
	
	
	public Animal(int age, String gender, int weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is Sleeping");
	}
	
	public abstract void move();
	
}
