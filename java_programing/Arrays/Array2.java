import java.util.Scanner;
class Array2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the Array:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("Enter" +n+ "Elements:");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("User enterd array Elements:");
for(int i=0;i<ar.length;i++)
{
System.out.println(i+ "-->" +ar[i]);
}
System.out.println("Sum of Array Elements:");
int sum=0;
for(int i=0;i<ar.length;i++)
{
sum=sum+ar[i];
}
System.out.println(sum);
}
}