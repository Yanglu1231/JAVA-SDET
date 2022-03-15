package user_regist;

import java.util.ArrayList;

public class DAO {
	ArrayList<User_registration> User_registration = new ArrayList<>();
	
	//CRUD - Create Method
	public void addNewRegistration(User_registration regist) {
		User_registration.add(regist);
		System.out.println("Successfull added " + regist.getFirstName() );
	}
	
	//Delete
	public void deleteNewRegistration(User_registration regist) {
		User_registration.remove(regist);
		System.out.println("Successfull Deleted " + regist.getFirstName() );
	}
	
	//Update
	public void updateNewRegistration(User_registration registOld, User_registration registNew) {
		User_registration.remove(registOld);
		User_registration.add(registNew);
		System.out.println("Successfull Updated from " + registOld.getFirstName() + "to " + registNew.getFirstName());
	}
	
	//Get
	public void getRegistration(User_registration regist) {
		for(int i=0;i<User_registration.size();i++) {
			if(User_registration.get(i).getFirstName() == regist.getFirstName() && 
					User_registration.get(i).getLastName() == regist.getLastName()) {
				User_registration.get(i);
				System.out.println("Successfull Get " + regist.getFirstName() + regist.getLastName());
			}
			else {
				System.out.println("This person does not exist");
			}
		}
	}
}
