import java.util.Scanner;
class Palindrome1
{
static boolean Palindrome(int n)
{
int rev=0;
int temp=n;
while(n>0)
{
int r=n%10;
rev=(rev*10)+r;
n=n/10;
}
if(temp==rev)
{
return true;
}
else
{
return false;
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
boolean b=Palindrome(n);
System.out.println(b);
}
}