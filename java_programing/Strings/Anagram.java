import java.util.Scanner;
class Aanagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First String");
String s1=sc.nextLine();
System.out.println("Enter Second String");
String s2=sc.nextLine();
boolean rs=isAnagram(s1,s2);
if(rs)
System.out.println("String is Anagram");
else
System.out.println("String is not Anagram");
}


static boolean isAnagram(String s1,String s2)
{
int count1[]=new int[26];
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(ch>=65&&ch<=90)
count1[ch-65]++;
else if(ch>=97&&ch<=122)
count1[ch-97]++;
}
int count2[]=new int[26];
for(int i=0;i<s2.length();i++)
{
char ch=s2.charAt(i);
if(ch>=65&&ch<=90)
count2[ch-65]++;
else if(ch>=97&&ch<=122)
count2[ch-97]++;
}
for(int i=0;i<count2.length;i++)
{
if(count1==count2)
return false;
} 
return true;
}
}

