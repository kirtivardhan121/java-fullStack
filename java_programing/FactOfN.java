import java.util.Scanner;
class FactOfN
{
static int fact(int n)
{
int fact=1;
while(n>1)
{
fact=fact*n;
n--;
}
return fact;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number:");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
System.out.println("Factorial Of first " +n+ " number is " +fact(i));
}
}
}