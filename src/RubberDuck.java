
public class RubberDuck extends Duck {

	RubberDuck(){
		flyBehavior = new FlyNoWay();
		   quackBehavior = new Squeak();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
     System.out.println("look like a rubber");
	}

}
