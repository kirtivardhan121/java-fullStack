import java.util.Scanner;
class Digit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Something");
int n=sc.nextInt();
if(n>=-9 && n<=9)
{
System.out.println("You have entered a digit");
}
else
{
System.out.println("You have entered a non-digit");
}
}
}