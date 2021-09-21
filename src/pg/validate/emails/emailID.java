package pg.validate.emails;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailID {

	public static void main(String[] args) {
		
		 List emails = new ArrayList();
	      emails.add("w.ghaja@gmail.com");
	      emails.add("mohamed12.d@gmail.com");
	      emails.add("system&hhs%Hotmail.com");
	      emails.add("fath33,^jhd@ltt.ly");
	      emails.add("magid#g.@nda.co");
	      emails.add("jamal.smah@ly.ly");
	      emails.add("@ltt.ly");
	      emails.add("simplearing@wesam.ly");
	      
	      String regex = "^(.+)@(.+)$";
	      Pattern pattern = Pattern.compile(regex);
	      
	      for (Object email : emails) {
	         Matcher matcher = pattern.matcher((CharSequence) email);
	         System.out.println(email + " : " + matcher.matches());
	      } 
	   }

}
