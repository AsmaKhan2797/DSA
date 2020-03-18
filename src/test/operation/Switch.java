package test.operation;

public class Switch {
// if we don't use break in switch then all cases are executed in sequence after matched case
	public static void main(String args[]) {

		int a = 2;
		int x = 0;
		switch (a) {
		case 1:
			++x;
			System.out.println("1  :" + x);
			//break;
		case 2:
			++x;
			System.out.println("2 :" + x);
			//break;
		case 3:
			++x;
			System.out.println("3  :" + x);
			//break;
		case 4:
			++x;
			System.out.println("4 :" + x);
			//break;
		default:
			++x;
			System.out.println("5 :" + x);
			//break;
			

		}
System.out.println("aaaaaaaaaaaaa :"+x);

for (int i=0;i<10;i--) {
	i+=2;System.out.println("--------------------"+i);}
	}
	
		
}
