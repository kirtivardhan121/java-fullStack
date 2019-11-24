import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int rev=0, t=n;
while(n!=0)
{
int r=n%10;
rev=rev*10+r;
n=n/10;
}
if(rev==t)
{
System.out.println("Entered Number is palindrome" +t);
}
else
{
System.out.println("Entered nuber is not a Palindromme");
}
}
}
