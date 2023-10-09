package sept_9_selenium;

public class Demo1 {
//static global variables
	static int x,y,z;
	static double a,b,c;
	public static void add()
	{
		x=789;
		y=78;
		z=x+y;
		System.out.println(z);
	}
	public static void division()
	{
		a=76654;
		b=98;
		c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		//calling static methods with class name
				Demo1.add();
				Demo1.division();
	}

}
