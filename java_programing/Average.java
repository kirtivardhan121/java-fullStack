import java.util.Scanner;
class Average
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int n=sc.nextInt();
double sum=0;
double avg=1;
int count=0;
while(n!=0)
{
int a=n%10;
count++;
sum=a+sum;
n=n/10;
}
System.out.println("Average"+avg/count);
}
}
