package log_in_form;
//import java.util.regex.*;
//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
//import java.awt.Dimension;
import java.awt.event.*;  
import java.util.Locale;
import javax.swing.*;  
public class MasterClass2{  
String user;
int emaillength;
boolean result1;
public MasterClass2(){  
final JFrame login_form = new JFrame();    

JLabel header = new JLabel();
header.setText("<html><font color=white size=5><b>USER LOGIN</b></html>");
header.setBounds(75, 5, 160, 20);

final JLabel  Username = new JLabel(); 
Username.setText("<html><font color=white size=4><b>Username:</b></html>");
Username.setBounds(5, 50, 76, 16);  
  
JLabel Password = new JLabel();  
Password.setText("<html><font color=white size=4><b>Password:</b></html>");
Password.setBounds(5, 80, 76, 20);    

final JTextField UsernameTF = new JTextField();  
UsernameTF.setBounds(80, 50, 184, 25);  
  
final JPasswordField PasswordTF = new JPasswordField();  
PasswordTF.setBounds(80, 80, 184, 25);  
  
JButton sbmt = new JButton();  
sbmt.setText("<html><font color = rgb(0,102,102) size = 4><b>SUBMIT</b></html>");
sbmt.setBounds(72, 120, 140, 30);  


login_form.add(Username);  
login_form.add(Password);   
login_form.add(header);
login_form.add(UsernameTF);  
login_form.add(PasswordTF);    
login_form.add(sbmt);
Color c = new Color(0, 102, 102);
login_form.getContentPane().setBackground(c); 
login_form.setSize(290,195);  
login_form.setLayout(null);  
login_form.setVisible(true);  

   sbmt.addActionListener(new ActionListener(){  
@Override
public void actionPerformed(ActionEvent e){ 
    emaillength = PasswordTF.getText().length();
    user = UsernameTF.getText();
    String email = user;
    result1 = checkemail.isValid(email);
            if(((emaillength >=8) && (emaillength <= 12)) && (true == result1))
               {
            PasswordTF.setText("");  
            UsernameTF.setText(""); 
            //UsernameTF.setText(Integer.toString(UsernameTF.getText().length())); 
            System.out.println("\n Provided email address "+ email+ " is valid ");
            login_form.setVisible(false); 
            //frame.setVisible(true);
               }
            else  if(((emaillength <8) || (emaillength > 12)) && (false == result1))
               {  
    JOptionPane.showMessageDialog(null, "ERROR", "ERROR MESASGE ", JOptionPane.ERROR_MESSAGE);  
    JOptionPane.setDefaultLocale(Locale.CHINA);
    //JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
                   //JOptionPane.showMessageDialog(UsernameTF, "both email and password are invalid");
                //System.out.println("both email and password are invalid");
               }
            else if ((emaillength <8) || (emaillength > 12)){
        System.out.println("password not in range");
               }
            else if(false == result1){
                System.out.print("invalid username");
            }
//checkemail result = new checkemail();
//there is no need to cereate the object to access this method isvalid since it is declared under static 
//so we will use the class name to access it as well
//System.out.println("Provided email address "+ email+ " is invalid \n");
}});  
} 
public static void main(String[] args) {  
// TODO Auto-generated method stub  
MasterClass2 s = new MasterClass2();
}}
  