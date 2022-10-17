package lab1;

import java.util.Scanner;

public class Trapezium  implements  Polygon {

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public int getNumberOfSide(int sides) {
        return sides;
    }

    @Override
    public int totalIntAngleSum(int s) {
        return s-2;
    }

  public  Trapezium(){
      super();
  }


    public static void main(String[] args) {

        String  name ;
        int side ;

        Scanner   trap =  new Scanner(System.in);
        System.out.println("Enter the name of the symbol:");
        name = trap.nextLine();
        System.out.println("Enter the number of sides");
        side = trap.nextInt();


    }
}
