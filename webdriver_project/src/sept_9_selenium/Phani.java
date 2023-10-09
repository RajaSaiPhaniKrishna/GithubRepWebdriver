package sept_9_selenium;

public class Phani {
	public static void add(int x,int y)
	{
	int z = x+y;
	//it is a void type so we write print statement hereitself
	System.out.println(z);
	}
public static  String verify_String (String Str1,String Str2)
{
String res ="";
if (Str1.equalsIgnoreCase(Str2))
{
	res = "Strings are equal";
}
	else 
	{
		res = "Strings are not equal";
	}
return res;
}
public static  boolean compare_values (int a,int b)
{
	if (a==b)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	public static void main(String[] args) {
		Phani.add(100, 234);
		String res = Phani.verify_String("Selenium", "Manual");
		System.out.println(res);
		boolean obj = Phani.compare_values(100, 200);
		System.out.println(obj);
		
		}

}
