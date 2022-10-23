package test;

import java.sql.Connection;
import java.util.Scanner;
public class send_to_database {
    Connection con;
public static void main(String args[]) throws ClassNotFoundException{
//    Scanner scan = new Scanner(System.in);
//    System.out.println("enter your first name");
//    String fn = scan.nextLine();
//    System.out.println("enter your second name");
//    String sn = scan.nextLine();
//    System.out.println("your names are"+" "+fn+" "+sn);
    Class.forName("com.mysql.jdbc.Driver");
    con = Drivermanager.getConnection();
}
    
}
