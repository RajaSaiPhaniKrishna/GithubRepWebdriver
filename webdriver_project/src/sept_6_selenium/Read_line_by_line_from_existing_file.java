package sept_6_selenium;
import java.io.*;
public class Read_line_by_line_from_existing_file {
public static void main(String[] args) throws Throwable{
		//read path of file
		FileReader fr = new FileReader("D:/sample.txt");
		BufferedReader br = new BufferedReader(fr);
		String Str = "";
		while ((Str = br.readLine())!=null)
		{
Thread.sleep(500);
System.out.println(Str);
	}
br.close();
}
}