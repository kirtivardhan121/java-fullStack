class Intersection
{
static int[] intersection(int a[],int b[])
{
int c[]=new int[a.length];
int k=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
{
c[k++]=a[i];
break;
}
}
}
int n[]=new int[k];
for(int i=0;i<k;i++)
{
n[i]=c[i];
}
return n;
}
public static void main(String args[])
{
int a[]={23,45,56,28,18};
int b[]={45,56,78};
int c[]=intersection(a,b);
for(int i=0;i<c.length;i++)
System.out.print(c[i]+",");
}
}