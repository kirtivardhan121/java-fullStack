import java.util.Scanner;
class Odd
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer nuber:");
int n=sc.nextInt();
String st[]={"Even","Odd"};
System.out.println(n+ "is "+ st[n%2]+" Number ");
}
}

