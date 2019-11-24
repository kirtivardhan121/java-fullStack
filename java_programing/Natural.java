import java.util.Scanner;
class Natural
{
static void sumOfNatural(int n)
{
int sum=0;
while(n>0)
{
sum=sum+n;
n--;
}
System.out.println(sum);
}
public static void main(String args[])
{

int n=5;
sumOfNatural(n);
System.out.println("------------");
sumOfNatural(7);
System.out.println("------------");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
sumOfNatural(x);
}
}
