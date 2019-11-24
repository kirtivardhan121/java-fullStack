import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age of a Person");
double n=sc.nextDouble();
if(n>=18)
{
System.out.println("Person is eligible for vote");
}
else
{
System.out.println("Person is not eligible for vote");
}
}
}