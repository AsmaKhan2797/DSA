/**
 * 
 */
/**
 * @author asma3608
 *
 */
package eda_test;


public class fraction_string_greater_one{
	public static void main(String args[]) {
		fraction_string_greater_one fs = new fraction_string_greater_one();
		boolean res= fs.fraction("12/30");
		System.out.println("res :"+ res);
		
		
		
	}
	private  boolean fraction(String test_string) {
		System.out.println("test mString"+ test_string);
		String[] separate= test_string.split("/");
		System.out.println("0 :"+separate[0]);
		System.out.println("1 :"+separate[1]);
		double num = Double.parseDouble(separate[0])/Double.parseDouble(separate[1]);
		System.out.println(num);
		
		float number =(int) num;
		if(number>=1) {
			return true;
		}
		
		return false;
		
	}
}