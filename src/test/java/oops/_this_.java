package test.java.oops;

public class _this_ extends A{
	public void test_super() {
		super.a=123;
		
	}
	//super.a=100;
	public static void main(String[] args) {
		_this_ sp= new _this_();
		//this is not allowed in static context
		//this.a=22;
		
		sp.m1(4);

	}
	 
}




