import java.util.Scanner;
class RupeeToPaisa
{
float p;
float r;
public static void main(String args[])
{
System.out.println("Enter Rupee to convert in paisa");
Scanner obj= new Scanner(System.in);
RupeeToPaisa obj1=new RupeeToPaisa();

obj1.r=obj.nextInt();
obj1.p=obj1.r*100;

System.out.println(+obj1.r+ " rupee ="+obj1.p+" paise");
}
}

