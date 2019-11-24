import java.util.Scanner;
class Array4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Size of Array:");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println("Enter " +n+ "Elements:");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("User entered Array Elements:");
for(int i=0;i<ar.length;i++)
{
System.out.println(i+ "-->" +ar[i]);
}
int sum=0,avg=0;
for(int i=0;i<ar.length;i++)
{ 
sum=sum+ar[i];
avg=sum/ar.length;
}
System.out.println(sum);
System.out.println(avg);
}
}

