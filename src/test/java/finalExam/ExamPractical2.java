package finalExam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExamPractical2 {

	

	public static void main(String[] args) {
		Properties prop = new Properties();
		try {
			InputStream doesFileExist = new FileInputStream("src\\main\\java\\config.properties");
			prop.load(doesFileExist);
			System.out.println(prop.getProperty("Apple"));
			System.out.println(prop.getProperty("Apple1"));
			System.out.println(prop.getProperty("Apple2"));
			System.out.println(prop.getProperty("Table"));
			System.out.println(prop.getProperty("Table1"));
			System.out.println(prop.getProperty("Table2"));
			System.out.println(prop.getProperty("orange"));
			System.out.println(prop.getProperty("Orange1"));
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
	
  
}
