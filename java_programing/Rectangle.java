import java.util.Scanner;
class Rectangle
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter Length Of Rectangle:");
double l=sc.nextDouble();

System.out.println("Enter Breadth Of Rectangle:"); 
double b=sc.nextDouble();

double a=(l*b);
System.out.println("Area of Rectangle:" + a);

double p=2*(l+b);
System.out.println("Perimeter of Rectangle:" + p);
}
}



