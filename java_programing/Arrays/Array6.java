import java.util.Scanner;
class Array6
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
System.out.println("Biggest number amongst them is:"); 
int max=ar[0];
for(int i=0;i<ar.length;i++)
{ 
if(max<ar[i])
max=ar[i];
}
System.out.println(max);

}
}
