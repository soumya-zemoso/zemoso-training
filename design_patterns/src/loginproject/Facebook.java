package loginproject;

import java.io.*;

public class Facebook implements AppLogin {

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
			 System.out.println("You have succesfully loggedin through Facebook");
		 }
		 else
		 {
			 System.out.println("Invalid credentials");
		 }
	}

}
