import java.util.Scanner;
class Currency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter amount in Rupees:");
int amount=sc.nextInt();
int count=0;
if(amount>=2000)
{
int tt=amount/2000;
count=count+tt;
System.out.println(tt + " two thousand rs notes= ");
amount=amount%2000;
}
if(amount>=500)
{
int tt=amount/500;
count=count+tt;
System.out.println(tt + " five hundred rs notes= ");
amount=amount%500;
}
if(amount>=200)
{
int tt=amount/200;
count=count+tt;
System.out.println(tt + " two hundred rs notes= ");
amount=amount%200;
}
if(amount>=100)
{
int tt=amount/100;
count=count+tt;
System.out.println(tt + " one hundred rs notes= ");
amount=amount%100;
}
if(amount>=50)
{
int tt=amount/50;
count=count+tt;
System.out.println(tt + " fifty rs notes= ");
amount=amount%50;
}
if(amount>=20)
{
int tt=amount/20;
count=count+tt;
System.out.println(tt + " twenty rs notes= ");
amount=amount%20;
}
if(amount>=10)
{
int tt=amount/10;
count=count+tt;
System.out.println(tt + " ten rs notes= ");
amount=amount%10;
}
if(amount>=5)
{
int tt=amount/5;
count=count+tt;
System.out.println(tt + " five rs notes= ");
amount=amount%5;
}

System.out.println("Total" +count+ "Amount of notes");
count=0;
if(count>=2)
{
int tt=amount/2;
count=count+tt;
System.out.println(tt + " Two rs coins= ");
}
if(count>=1)
{
int tt=amount/1;
count=count+tt;
System.out.println(tt + " One rs Coins= ");
}
}
}