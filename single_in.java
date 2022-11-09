import java.util.*;
class New {
 int id;
}
class new1 extends New
{
int number;
}
class single_in{
public static void main(String[] args)
{
new1 n= new new1();
Scanner sc=new Scanner(System.in);
System.out.println("enter the id and number:");
n.number=sc.nextInt();
n.id=sc.nextInt();
System.out.println("the id and the number is :"+n.id+" "+n.number);
}
}
