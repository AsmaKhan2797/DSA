package test.operation;

public class prmitive_data {

	public static void main(String[] args) {

		double d = 4.555;
		System.out.println("d :" + d);
		prmitive_data pm = new prmitive_data();
		double dd;
		dd = pm.parse_by_value(d);
		System.out.println("d :" + d);
		System.out.println("dd :" + dd);
		byte b=1;
		b+=1;
		System.out.println("dd :" + b);
		b+=2; //b += 1 is an equivalent to b = (byte)(b + 1)
		System.out.println("dd :" + b);
		//b=b+3;  b + 1 is promoted to int
		
		char c=11;
		c+=11;
		System.out.println("c :" + c);
		//c=c+11;
		short s=11;
			s+=11;
			System.out.println("s :" + s);
			//s=s+11;
			final byte C1 = 11;
			System.out.println("C1s :" + C1);
			 final byte C2 = C1+C1;
			 System.out.println("C1 :" + C2);

	}

	public double parse_by_value(double d) {

		d = 5.55;
		return d;
	}

}
