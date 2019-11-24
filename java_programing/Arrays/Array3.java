import java.util.Scanner;
class Array3
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
System.out.println("User entered Array Eleents:");
for(int i=0;i<ar.length;i++)
{
System.out.println(i+ "-->" +ar[i]);
}
int pc=0,nc=0;
for(int i=0;i<ar.length;i++)
{ 
if(ar[i]<0)
nc++;
else
pc++;
}
System.out.println("Total Positive Number : " +pc);
System.out.println("Total Negative Number : " +nc);
}
}

