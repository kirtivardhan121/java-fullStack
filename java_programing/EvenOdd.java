import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer nuber:");
int n=sc.nextInt();

if(n%2==1)
{
System.out.println("number is odd" + n);
}
else
{
System.out.println("number is even" + n);
}
}
}