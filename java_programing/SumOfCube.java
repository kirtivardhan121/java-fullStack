import java.util.Scanner;
class Cube
{
static int SumOfCube(int n)
{
int sum=0;
while(n!=0)
{
int r=n%10;
sum=sum+r*r*r;
n=n/10;
}
return sum;
}
public static void main(String args[])
{
int x=234,y=672;
int s1=SumOfCube(x);
System.out.println("Sum Of Cube of Digits"+x+"is"+x);
System.out.println("Sum Of Cube of Digits"+y+"is"+SumOfCube(y));
}
}