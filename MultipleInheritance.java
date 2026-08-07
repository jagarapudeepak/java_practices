package inheritance;
interface I1{
	int x=100;
	void sample();
}
	interface I2{
		int y=200;
		void demo();
	}
class Multi implements I1,I2{
	public void sample() {
		System.out.println("this is from interface I1");
	}
	public void demo() {
		System.out.println("this is from interface I2");
	}
	
}

public class MultipleInheritance extends Multi {
	public static void main(String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.sample();
		mi.demo();
		System.out.println("the x value is:" + I1.x);
		System.out.println("the y value is:" + I2.y);
	}
}
