
public class Zoo {
	
	public static void main(String args[]) {
		
		Bird animal=new Sparrow(1,"male",4);
		animal.move();
		animal.move();
		animal.eat();
		animal.sleep();
		
		Flyable flyingbird=new Sparrow(3,"f",1);
		flyingbird.fly();
		
		
		
		Animal animal1=new Fish(1,"male",4);
		Animal animal2=new Sparrow(1,"male",4);
		
		moveAnimal(animal);
		moveAnimal(animal1);
		moveAnimal(animal2);
	}
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
