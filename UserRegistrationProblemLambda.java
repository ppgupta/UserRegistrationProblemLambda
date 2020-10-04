package bridgelabz;
import  java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@FunctionalInterface
interface FirstName{
	boolean ValidateFirstName(String FN);
}
@FunctionalInterface
interface LastName{
	boolean ValidateLastName(String LN);
}
@FunctionalInterface
interface Email{
	boolean ValidateEmail(String email);
}
@FunctionalInterface
interface Mobile{
	boolean ValidateMobile(String mobile);
}
@FunctionalInterface
interface Password{
	boolean ValidatePassword(String password);
}


public class UserRegistrationProblemLambda {
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String Firstname=sc.nextLine();
		FirstName obj=name->{
			String regex="^[A-Z]{1}[a-z]{2,}";
			Pattern p=Pattern.compile(regex);
			if(name==null) {
				return false;
			}
			Matcher m=p.matcher(name);
			return m.matches(); 
		        
		};

		if(obj.ValidateFirstName(Firstname)) {
			System.out.println("Valid firstname");
		}
		while(obj.ValidateFirstName(Firstname)==false) {
			System.out.println("Invalid first name");
			System.out.println("Enter your first name again: ");
			String fName=sc.nextLine();
	        if(obj.ValidateFirstName(fName)) {
	    		System.out.println("Valid firstname");
	    		break;
	        }
	        
		}
		//Lastname validation
		LastName obj1=name->{
			String regex="^[A-Z]{1}[a-z]{2,}";
			Pattern p=Pattern.compile(regex);
			if(name==null) {
				return false;
			}
			Matcher m=p.matcher(name);
			return m.matches(); 
		        
		};
		
		System.out.println("Enter your Last name: ");
		String lastName=sc.nextLine();
		
		if(obj1.ValidateLastName(lastName)) {
			System.out.println("Valid lastname");
		}
		else {
			System.out.println("Invalid last name");
		}
		
		//email validation
		Email obj2=email->{
		     String regex=	"^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
			Pattern p=Pattern.compile(regex);
			if(email==null) {
				return false;
			}
			Matcher m=p.matcher(email);
			return m.matches(); 
		        
		};
		
		System.out.println("Enter your Email Id: ");
		String email =sc.nextLine();
		
		if(obj2.ValidateEmail(email)) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Invalid Email");
		}
		
		//mobile validation
		Mobile obj3=mobile->{
		    String regex=	"^((\\+)?(\\d{1,2}[\\s]))?(\\d{10}){1}?$";
			Pattern p=Pattern.compile(regex);
			if(mobile==null) {
				return false;
			}
			Matcher m=p.matcher(mobile);
			return m.matches(); 
		        
		};
		
		System.out.println("Enter your Mobile No: ");
		String mobile =sc.nextLine();
		
		if(obj3.ValidateMobile(mobile)) {
			System.out.println("Valid Number");
		}
		else {
			System.out.println("Invalid Number");
		}
		
        //password validation
		Password obj4=password->{
			 String regex=	"(?=.*[A-Z])(?=.*[0-9])(?=.*[\\W]).{8,}";
			
			Pattern p=Pattern.compile(regex);
			if(password==null) {
				return false;
			}
			Matcher m=p.matcher(password);
			return m.matches(); 
		        
		};
		
		System.out.println("Enter your Password: ");
		String password =sc.nextLine();
		
		if(obj4.ValidatePassword(password)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}

}
}
