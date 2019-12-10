import java.util.Scanner;
class Ascii
{
char c;
public static void main(String args[])
{
System.out.println("press enter to see ascii codes 1 to 30");
Scanner obj = new Scanner(System.in);
Ascii obj1= new Ascii();

for(char i=35;i<60;i++)
{
System.out.print(i);
System.out.print('\t');
}

System.out.println("");
System.out.println("");
System.out.println("press enter to see next 30 ascii codes");
obj1.c=obj.next().charAt(0);

for(char i=60;i<90;i++)
{
System.out.print(i);
System.out.print('\t');
}


}
}
