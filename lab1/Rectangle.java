package lab1;
import java.util.Scanner;
public class Rectangle{   
  static int length,width;
    public static void main(String []args){
        Quadrilateral object = new Quadrilateral("Richard","Rectangle");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length:");
        length = scan.nextInt();
        System.out.println("enter the width:");
        width = scan.nextInt();
        System.out.println("the area of rectangle is:"+object.getArea(length,width));
    }
}
