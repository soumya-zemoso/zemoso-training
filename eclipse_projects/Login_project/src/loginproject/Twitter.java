package loginproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Twitter implements AppLogin {

	@Override
	public void login() throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		 System.out.println("Enter username");
		 String uname=inp.readLine();
		 System.out.println("Enter password");
		 String pwd=inp.readLine();
		 if(uname.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("admin"))
		 {
			 System.out.println("You have succesfully loggedin through Twitter");
		 }
		 else
		 {
			 System.out.println("Invalid credentials");
		 }
	}


}