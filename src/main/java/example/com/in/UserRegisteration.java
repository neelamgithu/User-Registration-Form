//package example.com.in;
//
//import java.util.*;
////declear class to find valid and invalid enteries
//
//class Myexception extends Exception
//{
//  public Myexception(String str)
//  {
//      super(str);
//  }
//}
//
//public class UserRegistration {
//	public static void main(String[] args) {
//		System.out.println("Welcome to UserRegistration form Program");
//		  System.out.print("Enter your first name: ");
//	        Scanner scanner = new Scanner(System.in);
//	        String userInput = scanner.nextLine();
//	        System.out.println(isValidFirstName(userInput));
//	        
//			  System.out.print("Enter yourLast name: ");
//		        Scanner sc = new Scanner(System.in);
//		        String LastName = scanner.nextLine();
//		        System.out.println(isValidLastName(LastName));
//		        
//		        System.out.print("Enter your email id ");
//		        Scanner emailid = new Scanner(System.in);
//		        String email= scanner.nextLine();
//		        System.out.println(isValidemailid(email));
//		        
//		        System.out.print("Enter your mobile number ");
//		        Scanner mob = new Scanner(System.in);
//		        String number= scanner.nextLine();
//		        System.out.println(isValidmobnum(number));
//		        
//		        System.out.print("Enter your passward ");
//		        Scanner pass = new Scanner(System.in);
//		        String password = scanner.nextLine();
//		        System.out.println(isValidpassword(password));
//	
//	}
//	public static boolean isValidpassword(String password) {
//	
//			if(password !=null && password.matches("^(?=.*[!@#$%^&*()-+=]).*$"))
//		 {
//			  return true;
//		  }
//			
//		  else 
//			  	{return false;}
//		
//		}
//	
//		
//	
//
//	
//	public static boolean isValidmobnum(String number) {
//		if(number !=null && number.matches("((\\+)((0[ -])|((91 )))((\\d{12})+|(\\d{10})+))|\\d{5}([- ]*)\\d{6}"))
//		 {
//			  return true;
//		  }
//			
//		  else 
//			  	{return false;}
//      
//		  
//		
//	}
//
//
//
//	public static  boolean  isValidemailid(String email) {
//		if(email != null && email.matches("^[a-zA-Z0-9_+&-]+(?:\\\\.[a-zA-Z0-9_+&-]+)*@\" +\r\n"
//				+ "                \"(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$"))
//			{return true;
//	  }
//		
//	  else {
//		  	return false;
// 
//	  }
//	}
//
//	public static boolean isValidLastName(String LastName) {
//		 if( LastName != null && LastName.matches("[A-Z][a-zA-Z]{2,}"))
//		  {
//			  return true;
//		  }
//			
//		  else {
//			  	return false;
//       
//		  }
//		
//	}
//
//
//
//	public  static boolean isValidFirstName(String firstName) {
//        // Check if the first name starts with a capital letter and has a minimum length of 3 characters
//      
//		  if( firstName != null && firstName.matches("[A-Z][a-zA-Z]{2,}"))
//		  {
//			  return true;
//		  }
//			
//		  else {
//			  	return false;
//        
//		  }
//    }
//
//	
//	
//}
//declear class to find valid and invalid enteries
package example.com.in;

class Myexception extends Exception
{
    public Myexception(String str)
    {
        super(str);
    }
}
class User1 {
    // all data member are set as private with getter setter method called as encapsulation
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String password;
    public User1()
    {

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //parameterized constructor to  initialised objects
    public User1(String firstName, String lastName, String email, String mobileNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.password = password;
    }

    //method to check First  name is valid or not
    public Boolean isValidFirstName() throws Myexception {
        if(firstName==null || firstName.length()==0)
        {
            throw new Myexception("InvalidFirstNameException");
        }
        if (firstName.matches("[A-Z]{1,}[A-Za-z]{2,}")) {
            System.out.println("name is valid");
            return true;
        }
        System.out.println("invalid first name");

        return false;
    }

    //method to check last name is valid or not
    public Boolean isValidLastName() throws Myexception {
        if(lastName==null || lastName.length()==0)
        {
            throw new Myexception("InvalidLastNameException");
        }
        if (lastName.matches("[A-Z]{1,}[A-Za-z]{2,}")) {
            System.out.println("last name is valid");
            return true;
        }
        System.out.println("invalid last name");
        return false;

    }

    //method to check given emails is valid or not
    public boolean isValidEmail() throws Myexception {
        if(email==null || email.length()==0)
        {
            throw new Myexception("InvalidEmailException");
        }
        if (email.matches("^[a-z]+[-_.+]{0,1}[[0-9]*[a-z]*]+[@][[0-9]*[a-z]*]+.[a-z]+[a-z]+.[a-z]+[a-z]+$")) {
            System.out.println("valid email");
            return true;
        } else if (email.matches("^[a-z]+[-_.+]{0,1}[[0-9]*[a-z]*]+[@][[0-9]*[a-z]*]+.[a-z]+[a-z]+$")) {
            System.out.println("valid email");

            return true;

        }

        System.out.println(" Invalid email");

        return false;
    }

    public boolean isValidMobileNumber() throws Myexception{
        if(mobileNumber==null || mobileNumber.length()==0)
        {
            throw new Myexception("InvalidMobileNumberException");
        }
        if (mobileNumber.matches("[0-9]{2} [0-9]{10}")) {
            System.out.println(":valid mobile number");
            return true;
        }
        return false;
    }

    public boolean isValidPassword() throws Myexception {
        if(password==null || password.length()==0)
        {
            throw new Myexception("InvalidPasswordException");
        }
        if(password.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_=+{}|;:'<>,./?]).{8,}")) {
            System.out.println("valid password");
            return true;

        }
        return false;
    }
}
public class UserRegisteration {
    public static void main(String[] args) {
        System.out.println("welcome to user registration program");
        //created object and passed parameter to constructor
        User1 user = new User1("Neelam", "Mujawar", "neelammujawar@gmail.com", "91 123504789", "");
        try {
            System.out.println(user.isValidFirstName());
        } catch (Myexception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured"+e);
        }
        try {
            System.out.println(user.isValidLastName());
        } catch (Myexception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured"+e);
        }
        try {
            System.out.println(user.isValidEmail());
        } catch (Myexception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured"+e);
        }
        try {
            System.out.println(user.isValidMobileNumber());
        } catch (Myexception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured"+e);
        }
        try {
            System.out.println(user.isValidPassword());
        } catch (Myexception e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occured"+e);
        }
    }
}