import java.util.Scanner;
class PatternA15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n:");
int n=sc.nextInt();
int count=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=count;j++)
{
System.out.print("*");
}
if(i<=n/2)
count++;
else
count--;

System.out.println();
}
}
}