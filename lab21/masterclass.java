package lab21;

import java.util.regex.Pattern;

public class masterclass {
    
   public boolean checkemail(String email) {
       String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
       Pattern pattern = Pattern.compile(regex);
  if (email == null)
   return false;
    return pattern.matcher(email).matches();
   }
   
  public int getstringlength(String checklength){
      return checklength.length();
  } 
}
