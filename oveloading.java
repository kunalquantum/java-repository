import java.util.*;
public class overloading {
	static double area( double r)
         { return(r*r*3.14);
         }
        static int area( int x,int y)
         {

	return (x*y);
         }
        static int area(int a, int b, int c)
         {
          return((a+b+c)/3);
	}
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the radius");
double r=sc.nextInt();
double radius=area(r);
System.out.println("Radius:"+radius);

System.out.println("enter the length and breadth of the rectacangle");
int x=sc.nextInt();
int y=sc.nextInt();
int rect=area(x,y);
System.out.println("AREA of Rect:"+rect);

System.out.println("enter the length and breadth and height  of the triangle");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int tri=area(a,b,c);
System.out.println("AREA of TRIANGLE:"+tri);
}
}



