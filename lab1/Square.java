package lab1;
import java.util.Scanner;
public class Square extends Quadrilateral{
    //String name;
    Square(){
        super("square");
    }
    public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter side");
     int sides = scan.nextInt();
    System.out.println("the area of square is:"+" "+getArea(sides));
    }
    }
    
    
    




