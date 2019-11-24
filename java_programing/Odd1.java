import java.util.Scanner;
class Odd1
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer nuber:");
int n=sc.nextInt();
if((n&1)==0)
{
System.out.println("Number is even" + n);
}
else
{
System.out.println("Number is odd" +n);
}
}
}