package lab1;

import java.util.Scanner;

public class Square  extends  Quadrilateral {


    String name ;
    public  Square(String name){
        super(name);
        this.name= name;
    }



    int side;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Quadrilateral qq =  new  Quadrilateral("Square");

        Square s = new Square("Square");
//        S.name  = sc.nextLine();

        System.out.println(qq.typeOfQuadrilateral);



        System.out.println( s.name);
        System.out.println("Enter side:  ");

         s.side = sc.nextInt();

        System.out.println("Area of square is:"+ Area(s.side));


    }
}
