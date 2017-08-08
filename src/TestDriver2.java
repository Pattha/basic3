
public class TestDriver2 {

	public static void main(String[] args) {
		MallardDuck d1 = new MallardDuck();
		d1.performQuack(); //Quack
		d1.display();  //Look like mallard
		d1.performFly(); //I'm flying
		RubberDuck d2 = new RubberDuck();
		d2.performQuack(); //Squeak!Squeak!
		d2.display(); // Look like a rubber
		d2.performFly(); // I can not fly
		
	}

}


