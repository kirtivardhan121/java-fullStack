import java.util.Scanner;
class PatternA19
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
char ch=(char)(64+i);
for(int j=1;j<=i;j++)
{
System.out.print(ch+"");
ch++;
}

System.out.println();
}
}
}
