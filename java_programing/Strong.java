import java.util.Scanner;
class Strong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int no=sc.nextInt();
boolean res=IsStrong(no);
if(res==true)
{
System.out.println(no+"Number is Strong");
}
else
{
System.out.println(no+"Number is not Strong");
}
}
boolean IsStrong(int n)
{
int sum=0,t=n;
while(n!=0)
{
int r=n%10;
sum=sum+fact(x);
n=n/10;
}
if(t==sum)
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}

int fact(int x)
{
int f=1;
while(x>1)
{
f=f*x;
x--;
}
}
}

                                                                                                                 