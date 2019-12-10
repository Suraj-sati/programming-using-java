import java.util.Scanner;
class AreaOfTriangle
{
int b;
int h;
 
public static void main(String args[])
{


AreaOfTriangle obj1 = new AreaOfTriangle();
Scanner obj2= new Scanner(System.in);
System.out.println("enter breadth");
obj1.b=obj2.nextInt();
System.out.println("enter height"); 	
obj1.h=obj2.nextInt();
System.out.println("Area of triangle"+" "+0.5*obj1.b*obj1.h);
}
}
