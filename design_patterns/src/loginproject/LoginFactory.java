package loginproject;

public class LoginFactory {
	public AppLogin getApp(String AppType){
	      if(AppType == null){
	         return null;
	      }		
	      if(AppType.equalsIgnoreCase("facebook")){
	         return new Facebook();
	         
	      } else if(AppType.equalsIgnoreCase("twitter")){
	         return new Twitter();
	         
	      } else if(AppType.equalsIgnoreCase("google")){
	         return new Google();
	         
	      } else if(AppType.equalsIgnoreCase("linkedin")){
		         return new Linkedin();
		  }
	      
	      return null;
	   }

}
