package Assignement;

import java.util.Scanner;

interface  Polygon{
   String getName(String name);
   int getNumberOfSide(int sides);
   int totalIntAngleSum(int s);
}

//class  Test{}


public class Main  implements  Polygon {

    public static void main(String[] args) {

        var m = new Main();

        Scanner sc = new Scanner(System.in);

        int sides, total;
        String nameOfPolygon;

        System.out.println("Enter name of polygon:");
        nameOfPolygon = sc.nextLine();
        System.out.println("Enter number of sides");
        sides = sc.nextInt();


        System.out.println("Polygon is: " + m.getName(nameOfPolygon));
        System.out.println("Number of sides is: " + m.getNumberOfSide(sides) + "sides");
        System.out.println("Total is: " + m.totalIntAngleSum(sides) + "degrees");

    }

    @Override
    public String getName(String name) {
        return name;
    }


    @Override
    public int getNumberOfSide(int s) {
        return s;
    }

    @Override
    public int totalIntAngleSum(int s) {
        return (getNumberOfSide(s)-2)*180;
    }
}
