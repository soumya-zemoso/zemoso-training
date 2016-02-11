package loginproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginDemo {
	public static void main(String[] args) throws IOException {

	    LoginFactory loginFactory = new LoginFactory();
	    BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	    System.out.println("Enter application name");
		String appname=inp.readLine();
	    AppLogin applogin = loginFactory.getApp(appname);
	    applogin.login();
		
	}
  

}
