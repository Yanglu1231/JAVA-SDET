package user_regist;

import java.util.regex.Pattern;

public class User_registration {
	private String FirstName;
	private String LastName;
	private String PhoneNumber;
	private String EmailAddress;
	private String UserName;
	private int Age;
	
	//Phone Number -
	//Only 10 number allowed, format phone number(1-xxx-xxx-xxxx) when
	//showing to users and consider all other test cases (ex. no empty, no
	//special characters, etc.)
	public boolean isValidPhoneNumber(String phoneNo) {
		
        // First validate that the phone number is not null and has a length of 10 and check no empty
        if (null == phoneNo || phoneNo.length() != 10) {
            return false;
        }
        
        // Next check no special characters and all digits
        for(int i=0; i<phoneNo.length();i++) {
			if(Character.isDigit(phoneNo.charAt(i)) == false) {
				return false;
			}
		}
        
        // At this point you know it is valid
        return true;
    }
	
	public boolean containsSpecialCharacter(String s) {
	    return (s == null) ? false : s.matches("[^A-Za-z0-9 ]");
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	
	public void setFirstName(String firstName) {
		boolean flag = true;
		
		//Check other test cases
		for(int i=0; i<firstName.length();i++) {
			if(Character.isDigit(firstName.charAt(i)) == true || firstName.charAt(i) == ' ' || containsSpecialCharacter(firstName) == true) {
				flag = false;
			}
		}
		
		if(firstName.length() < 24 && flag == true) {
		FirstName = firstName;
		System.out.println("First name is " + firstName);
		this.FirstName = firstName;
		}
		else {
			System.out.println("Invalid First Name");
		}
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		boolean flag = true;
		
		//Check other test cases
		for(int i=0; i<lastName.length();i++) {
			if(Character.isDigit(lastName.charAt(i)) == true || lastName.charAt(i) == ' ' || containsSpecialCharacter(lastName) == true) {
				flag = false;
			}
		}
		
		if(lastName.length() < 24 && flag == true) {
		FirstName = lastName;
		System.out.println("Last name is " + lastName);
		this.LastName = lastName;
		}
		else {
			System.out.println("Invalid Last Name");
		}
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
//	Phone Number -
//	Only 10 number allowed, format phone number(1-xxx-xxx-xxxx) when
//	showing to users and consider all other test cases (ex. no empty, no
//	special characters, etc.)
	public void setPhoneNumber(String phoneNumber) {
		if(isValidPhoneNumber(phoneNumber) == true) {
			System.out.println("1-" + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6,10));
			this.PhoneNumber = phoneNumber;
		}
		else {
			System.out.println("Invalid Phone Number");
		}
	}
	
	public boolean isValidEmail(String email)
    {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
	
//	implement all email related testcases to check if correct email is entered
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		if(isValidEmail(emailAddress) == true) {
			System.out.println("Email Address is" + emailAddress);
			this.EmailAddress = emailAddress;
		}
		else {
			System.out.println("Invalid Email");
		}
	}
	
	public String getUserName() {
		return UserName;
	}
	
//	 Should be between 8 to 24 characters and consider all other test cases (ex. no empty, etc.)
	public void setUserName(String userName) {
		
		boolean flag = true;
		
		for(int i=0; i<userName.length();i++) {
			if(userName.charAt(i)== ' ') {
				flag = false;
			}
		}
		
		if(userName.length() < 24 && userName.length() > 8 && flag == true) {
			System.out.println("User name is " + UserName);
			this.UserName = userName;
		}
		else {
			System.out.println("This is an invald user name");
		}
	}
	
	public int getAge() {
		return Age;
	}
	
//	Allow only age between 18 to 110 years old for registration
	public void setAge(int age) {
		if(age>= 18 && age <= 110) {
		System.out.println("User age " + age);
		this.Age = age;
		}
		else {
			System.out.println("This is an invald age");
		}
	}

}
