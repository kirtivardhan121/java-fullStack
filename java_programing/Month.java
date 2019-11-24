import java.util.Scanner;
class Month
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter month number");
int n=sc.nextInt();
if(n>0 && n<=12)
{
System.out.println("Entered month number is valid");
}
else
{
System.out.println("Entered month number is not nalid");
}
}
}