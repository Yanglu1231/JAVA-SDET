package user_regist;

import java.util.Scanner;

public class FrontEndUI {
	
	
	public void updateName(String old, String now) {
		
	}

	public static void main(String[] args) {
		
		DAO Customer = new DAO();
		
		User_registration a = new User_registration();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String s = scan.nextLine();
		a.setFirstName(s);
		
		System.out.println("Enter Last Name:");
		String l = scan.nextLine();
		a.setLastName(l);
		
		System.out.println("Enter Phone Number:");
		String p = scan.nextLine();
		a.setPhoneNumber(p);
		
		System.out.println("Enter email address:");
		String e = scan.nextLine();
		a.setEmailAddress(e);
		
		System.out.println("Enter user name:");
		String u = scan.nextLine();
		a.setUserName(u);
		
		System.out.println("Enter age:");
		int i = scan.nextInt();
		a.setAge(i);
		
		Customer.addNewRegistration(a);
		scan.close();
		
	}

}
