import java.util.Scanner;
class String1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter input String:");
String st=sc.nextLine();
int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;
for(int i=0;i<st.length();i++)
{
char ch=st.charAt(i);
if(ch>=65 && ch<=90)
{
uc++;
if(ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U')
vc++;
else
cc++;
}
else if(ch>=97 && ch<=122)
{
lc++;
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
vc++;
else
cc++;
}
else if(ch>=48 && ch<=57)
dc++;
else
spc++;
}
System.out.println("Number of vowels present" +"-->" +vc);
System.out.println("Number of constatn present" +"-->" +cc);
System.out.println("Number of upper case present" +"-->" +uc);
System.out.println("Number of lower case present" +"-->" +lc);
System.out.println("Number of digits present" +"-->" +dc);
System.out.println("Number of special character present" +"-->" +spc);
}
}







