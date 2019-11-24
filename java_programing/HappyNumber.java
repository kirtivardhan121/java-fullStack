import java.util.Scanner;
class HappyNumber
{
static boolean isHappy(int n)
{
while(n>9)
{
int sum=0;
while(n!=0)
{
int r=n%10;
sum=sum+r*r;
n=n/10;
}
n=sum;
}
return n==1||n==7;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check:");
int n=sc.nextInt();
boolean b=isHappy(n);
if(b)
{
System.out.println("Happy number");
}
else
{
System.out.println("Not a Happy number");
}
}
}