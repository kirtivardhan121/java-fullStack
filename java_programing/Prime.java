import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
int i=1,count=1;
while(i<=n/2)
{
if(n%i==0)
count++;
i++;
}
if(count==2)
{
System.out.println("Entered number is prime");
}
else
{
System.out.println("Entered number is not prime");
}
}
}
