package oops;

public class My_Calculation extends Calculation{

	
	public void multiplication(int x, int y) {
		z = x*y;
		System.out.println("multiply : " + z);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a =20;
		int b =10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.Substraction(a, b);
		demo.multiplication(22, 56);
	}

}
