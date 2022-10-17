package projects;
interface animals{
 public void animalsounds();
    }
interface boy{
    public void sleep();
}
public class test implements animals,boy{
@Override
public void animalsounds(){ 
    System.out.println("this is the animal sound");
}
@Override
public void sleep(){
    System.out.println("this is sleep function");
}
  public static void main(String []args)
  {
      test object = new test();
      object.animalsounds();
      object.sleep();
  }
}