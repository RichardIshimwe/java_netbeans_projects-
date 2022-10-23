package lab2;
import java.util.regex.Pattern;

public class masterclass {
    
public static boolean checkEmail(String email)
{
String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
Pattern pattern = Pattern.compile(regex);
if (email == null)
return false;
return pattern.matcher(email).matches();
}
  public int getStringLength(String checklength){
      return checklength.length();
  }
  public String changeToUpper(String text){
      return text.toUpperCase();
  }
}
