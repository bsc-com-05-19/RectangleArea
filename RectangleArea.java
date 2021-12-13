import java.util.Scanner;
public class RectangleArea{
  public static void main(String [] args){
  Scanner input = new Scanner(System.in);
  System.out.println("The area will be shown here");
  System.out.println("Enter length");
  double leng = input.nextDouble();
System.out.println("Enter breadth");
  double bread = input.nextDouble();
 Area calcarea = new Area(leng, bread);
  }
}
class Area{
  private double length, breadth;
  Area(double length, double breadth){
 leng = length;
  bread = breadth;
  }
 public double returnarea(){
   double area = length * breadth;
  return area;
 }
}