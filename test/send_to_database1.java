
package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class send_to_database1 {
    Connection con;
    public void conect() throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dred?" + "user=root");
        } catch (SQLException ex) {
            Logger.getLogger(send_to_database1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void execute(String firstname,String secondname) throws SQLException{
     
        try {
            conect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(send_to_database1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "INSERT INTO `host`(`firstname`, `secondname`) VALUES(?,?)";
        PreparedStatement p = con.prepareStatement(sql);
       try {
           p.setString(1,firstname);
           p.setString(2,secondname);
       } catch (SQLException ex) {
           Logger.getLogger(send_to_database1.class.getName()).log(Level.SEVERE, null, ex);
       }
        try {
            p.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(send_to_database1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String []args){
        send_to_database1 instance = new send_to_database1();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first name");
         String firstname = scan.nextLine();
        System.out.println("enter last name");
         String secondname = scan.nextLine();
       try {
           instance.execute(firstname,secondname);
       } catch (SQLException ex) {
           Logger.getLogger(send_to_database1.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
