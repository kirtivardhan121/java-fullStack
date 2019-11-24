import java.util.Scanner;
class countWord
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String:");
String str=sc.nextLine();
int c=wordCount(str);
System.out.println("Number of Words Are:" +c);
}
static int wordCount(String str)
{
char ch[]=str.toCharArray();
int count=0;
for(int i=0;i<ch.length;i++)
{
if(i==0 && ch[i]!=' '||ch[i]!=' ' && ch[i-1]==' ')
count++;
}
return count;
}
}
