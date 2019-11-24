import java.util.Scanner;
class Product
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Total Amount a person have");
int a=sc.nextInt();
System.out.println("Enter the Amount of a single product");
int b=sc.nextInt();

int temp;
double c;
temp=a/b;
c=a%b;
System.out.println("No of products are:" +temp);
System.out.println("Change he will get:" +c);
}
}