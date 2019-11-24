import java.util.Scanner;
class String2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter input String:");
String st=sc.nextLine();
int sum=0;
for(int i=0;i<st.length();i++)
{
char ch=st.charAt(i);
if(ch>=48 && ch<=57)
{
sum=sum+ch-48;
}
}
System.out.println("Sum of Digits present in String:"+ "-->" +sum);
}
}