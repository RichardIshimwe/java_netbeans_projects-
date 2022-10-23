
package lab1;
import java.util.Scanner;
public class Trapezium implements polygon{
    
   static int a,b,h;  
     Trapezium(){
         super();
     }

    @Override
    public String getName(String name) {
     return name;
    }

    @Override
    public int getNumberOfsides(int side) {
        return side;
    }

    @Override
    public int totalIntAngleSum(int side) {
        return (side-2)*180;
    }
   public static void print(){
       System.out.println("thank you");
   }
     public static void main(String []args){
        Quadrilateral q= new Quadrilateral();
        Trapezium trap = new Trapezium();
        System.out.println("name of your polygon is :"+trap.getName("Hezagon"));
        System.out.println("number of sides :"+trap.getNumberOfsides(6));
        System.out.println("number of degree is : "+trap.totalIntAngleSum(6));
        Scanner scan = new Scanner(System.in);
        System.out.println("enter small base");
        a = scan.nextInt();
        System.out.println("enter big base");
        b = scan.nextInt();
        System.out.println("enter height");
        h = scan.nextInt();
        System.out.println("the area of trapezium is:"+q.getArea(a,b,h));
        print();
   }
}
