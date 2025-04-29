package regEx;

public class iHateRegEx {
 public static void main(String[] args) {
//	 String emailString = "123.124.125";
//	   boolean ok = emailString.matches("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
//	   System.out.println(ok);
//	   
//	   String emailString2 = "255.255.255.255";
//	   boolean ok2 = emailString2.matches("(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}");
//	   System.out.println(ok2);
	 
	 
	 String userNameString = "lorem";
	 boolean ok = userNameString.matches("^[a-z0-9_-]{3,15}$");
	 System.err.println(ok);
	 
	 
	 String passwordString = "abc";
	 boolean ok2 = passwordString.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$ %^&*-]).{8,}$");
	 System.err.println(ok2);
	   
}
     
}
