import java.util.Scanner;
class PosNeg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any Number");
int n=sc.nextInt();
if(n>=0)
{
System.out.println("Entered Number is Positive Number");
}
else
{
System.out.println("Enterd Nuber is Negative Number");
}
}
}