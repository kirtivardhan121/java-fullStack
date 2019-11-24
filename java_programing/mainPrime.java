import java.util.Scanner;
class mainPrime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range:");
int n=sc.nextInt();
int sum=0;
for(int i=2;i<n;i++)
{
boolean rs=isPrime(i);
if(rs==true)
{
sum=sum+i;
}
}
System.out.println("sum of Prime no between 1 to  " + n + " is " +sum);
}
static boolean isPrime(int x)
{
int j=2;
while(j<=x/2)
{
if(x%j==0)
return false;

else
j++;
}
return true;
}
}