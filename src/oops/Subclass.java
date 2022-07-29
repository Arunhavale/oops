package oops;

public class Subclass extends Superclass{
	
	Subclass(int age){
		super(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Subclass s = new Subclass(24);
		s.getAge();
	}

}
