package jcc;
public class Quadrilateral {
    public Quadrilateral(int side){
        
    }
    public Quadrilateral(){
        System.out.println("hellooo student");
    }
    public Quadrilateral(String name,int side){
        
    }
    public double getArea(int side){
        return side*side;
    }
      public double getArea(int length,int width){
        return length*width;
    }
        public double getArea(int a,int b,int h){
        return (a+b)*h/2;
    }
}
