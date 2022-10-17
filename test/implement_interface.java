
package test;
public class implement_interface implements first_interface{
@Override
public void prints(){
    System.out.println("hellooo over ride");
}
   public static void main(String []args){
       implement_interface object = new implement_interface();
       object.prints();
   } 
    
}
