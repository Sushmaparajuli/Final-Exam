package finalExam;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PracticalExam1 {

	public static void main(String[] args) {
		
		
		
		 		  
		int n=1;
		Set<Integer>myData =new TreeSet<Integer>();
		  
		while(myData.size()<500) {
			
		myData.add(getRandomNumber());
		}
		
		Object[]x=myData.toArray();
		System.out.println(x[n]);

		System.out.println("Give me Nth smallest number?");
		Scanner scanner = new Scanner(System.in);
		  int number=scanner.nextInt();
		  System.out.println("Thank you.");
	}
	public static int getRandomNumber() {
		Random random = new Random();
		 int randomNumber = random.nextInt(500);
		return randomNumber;
	}
}

