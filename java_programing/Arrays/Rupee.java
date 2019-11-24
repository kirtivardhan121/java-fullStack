class Rupee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number");
int n=sc.nextInt();
nw(n/10000000,"Crore");
nw(n/1000000%100,"Lakh");
nw(n/1000%100,"Thousand");
nw(n/100%10,"Hundred");
nw(n%100,"");
}
static void nw(int n,String st)
{
String one[]={"","One","Two",Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen",Nineteen"};
String two[]={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eigthty",Ninety"};
if(n<20)
System.out.print(one[n]);
else
System.out.print(two[n/10]+one[n%10]);
if(n!=0)
System.out.print(st+" ");
}
}