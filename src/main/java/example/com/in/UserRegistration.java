package example.com.in;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to UserRegistration form Program");
		  System.out.print("Enter your first name: ");
	        Scanner scanner = new Scanner(System.in);
	        String userInput = scanner.nextLine();
	        System.out.println(isValidFirstName(userInput));
	}
    

	
	public  static boolean isValidFirstName(String firstName) {
        // Check if the first name starts with a capital letter and has a minimum length of 3 characters
      
		  if( firstName != null && firstName.matches("[A-Z][a-zA-Z]{2,}"))
		  {
			  return true;
		  }
			
		  else {
			  	return false;
        
		  }
    }

}