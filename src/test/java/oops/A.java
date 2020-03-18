package test.java.oops;

public class A {
	int a = 10;

	public void m1(int a) {
		this.a = a;

		System.out.println("a :" + this.a);
	}

	 class B  {
		 int a =444;
		B() {
			//super();

			//System.out.println("b :" + this.a);
		}

		void show() {
			System.out.println("b :" + this.a);
		}
	}
}
class AAA{

	public static void main(String[] args) {
		
		//this is not allowed in static context
		//this.a=22;
		A a = new A();
		A.B bb = a.new B();
		bb.show();
	
}
}
