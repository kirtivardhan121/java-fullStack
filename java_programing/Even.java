import java.util.Scanner;
class Even
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer nuber:");
int n=sc.nextInt();

if((n/2)*2==n)
{
System.out.println("Nuber is Even");
}
else
{
System.out.println("Number is odd");
}
}
}
//without modulous operator