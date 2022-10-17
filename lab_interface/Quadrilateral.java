package lab_interface;
public class Quadrilateral {
    public double getArea(int side){
      return side*side;   
    }
    public double getArea(int length,int width){
        return length*width;
    }
    public double getArea(int a,int b,int height){
        return (a+b)*height/2;
    }
    public Quadrilateral(String name){
        System.out.println(name);
    }
     public Quadrilateral(){
        System.out.println("hellooo student");
    }
      public Quadrilateral(String name,String type){
        
    } 
}
