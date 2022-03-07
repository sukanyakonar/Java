package emailvalidation;

import java.util.*;
import java.util.regex.*; 

public class EmailValidation {
	
	public static void main(String[] args) {

		List<String> emails = new ArrayList<String>();
		// valid email addresses 
		emails.add("sukanya@mail.com"); 
		emails.add("sukanya.k@example.com"); 
		emails.add("sukanya@example.me.org");
		//invalid email addresses 
		emails.add("sukanya.example.com"); 
		emails.add("sukanya.kk#example..com"); 
		emails.add("@s.example.com");
		
		for (String value : emails) {
		System.out.println("Email address " + value + " is " + (isValidEmail(value) ? "Valid Email" : "Invalid Email"));

		}
		System.out.println("Enter any email address to check");
		Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			System.out.println("Email address " + input + " is " + (isValidEmail(input) ? "Valid Email" : "Invalid  Email"));
					
}
		public static boolean isValidEmail(String email) { 
			
			String regex = "^(.+)@(.+)$";     //Regular Expression
			//initialise the Pattern object
			Pattern pattern = Pattern.compile(regex); //compile regular expression to get the pattern
			Matcher matcher = pattern.matcher(email); //create instance of matcher
			return matcher.matches();

		}
		
}
