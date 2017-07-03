import java.util.Scanner;
public class Assignment4 {

	public  static void main(String[] arr) {
		byte a;
		short b;
		int c;
		long d;
		float e;
		double f;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input a");
a=sc.nextByte();
System.out.println("Please input b");
b=sc.nextShort();

c=a+b;// Adding Byte and Short Variables//
System.out.println(""+c);
d=b+c; // Adding Short and Int Variables//
System.out.println(""+d); // Automatic Type Casting //
e=c+d;// Adding Int and Long Variables//
System.out.println(""+e); // Automatic Type Casting //
f=d+e; //Adding Long and Float Variables//
System.out.println(""+f); // Automatic Type Casting //
c=(int)e+(int)f; //Adding float and Double Variables//
System.out.println(""+c); //Explicit Type Casting //
	}

}
