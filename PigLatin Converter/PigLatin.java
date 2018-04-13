import java.util.*;
import java.io.*;
public class PigLatin {
	public static void main(String []args) {
		System.out.println("Please enter the text you want converted.");
		Scanner name = new Scanner(System.in);
		String user = "";    
		while(!user.contains("finish")){
			user = name.nextLine(); 
			user = user.toLowerCase();
			String pig = user.substring(0,1);
			System.out.println("Your converted text is: ");
			System.out.println(user.substring(1) + pig + "ay");
			System.out.println("Enter 'finish' when done");
		}
	}
}

