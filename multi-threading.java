class mythread extends Thread
{

public void run()
{
  for(int i=1;i<=10;i++) 
   {
    System.out.println("child thread"); 
   }
}

}


class test1
{
public static void main(String args[])
{
mythread obj =new mythread();
obj.start();
for(int i=1;i<=10;i++)
{
System.out.println("main thread");
}
}
}
