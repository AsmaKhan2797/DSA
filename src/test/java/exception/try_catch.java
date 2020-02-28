/**
 * 
 */
/**
 * @author asma3608
 *
 */
package test.java.exception;

public class try_catch {

	public static void main(String[] args) {
		try {
			int data = 12 / 12;
			System.out.println("datad ::" + data);
			
			outer: for (int i=0; i < 5; i++){
				  for (int j = 0; j < i; j++) { 
				    System.out.println("j:"+j);
				    break outer;
				  }
				  System.out.println("i:"+i);
				}
		} catch (Exception e) {
			System.out.println("Exception  :" + e.getMessage());
		} finally {
			System.out.println("insdie filnally..........");
		}
	}
}