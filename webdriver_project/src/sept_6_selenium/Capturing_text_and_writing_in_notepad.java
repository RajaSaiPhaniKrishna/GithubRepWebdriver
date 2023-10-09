package sept_6_selenium;
import java.io.*;
public class Capturing_text_and_writing_in_notepad {
public static void main(String[] args)throws Throwable {
		File f = new File("D:/sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I'm regularly attending to classes");
		bw.newLine();
		bw.write("Myself yerramsetti.raja sai phani krishna");
		bw.newLine();
		bw.write("I want job after my training.");
		bw.flush();
		bw.close();
		
	}

}
