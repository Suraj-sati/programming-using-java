import java.util.Scanner;
class SimpleInterest
{ 
float p;
float r;
float t;
float si;
public static void main(String args[])
{
SimpleInterest obj1=new SimpleInterest();
Scanner obj=new Scanner(System.in);

System.out.println("enter principal amount");
obj1.p=obj.nextInt();
System.out.println("enter rate");
obj1.r=obj.nextInt();
System.out.println("enter time");
obj1.t=obj.nextInt();

obj1.si=(obj1.p*obj1.r*obj1.t)/100;

System.out.println("Simple interest is  "  +obj1.si);
}
}
