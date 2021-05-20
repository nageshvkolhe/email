import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static boolean isValid(String email) {
		
		String emailid = "[0-9 a-z A-Z]{3}[. _ + -][0-9 a-z A-Z]{3}+[@][a-z]{10}[.][a-z]{2}[.][a-z]{2}";
		
		Pattern p = Pattern.compile(emailid);
		if(email == null) {
			return false;
		}
		
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	public static void main(String args[]) {
	String email11 = "abc+xyz@bridgelabz.co.in";
	System.out.println(email11 +":" +isValid(email11));
	}			
}

