package inheritance;

abstract class One{
	int x=100;
	void sample() {
		System.out.println("my name is deepak");
	}
	abstract void sayMyAge();
	
}

public class AbstractDemo extends One {
	void sayMyAge() {
		System.out.println("my age is :19");
	}
	public static void main(String[] args) {
		AbstractDemo ad = new AbstractDemo();
		ad.sample();
		ad.sayMyAge();
		System.out.println("value is:"+ ad.x);
		
		
	}
	
	

}
