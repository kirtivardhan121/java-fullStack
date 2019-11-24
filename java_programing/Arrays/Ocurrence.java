class Ocurrence
{
public static void main(String args[])
{
int ar[]={34,56,67,56,56,79,34,67,79};
int n=ar.length;
for(int i=0;i<n;i++)
{
int count=1;
for(int j=i+1;j<n;j++)
{
if(ar[i]==ar[j])
{
ar[j]=ar[n-1];
count++;
n--;
j--;
}
}
System.out.println(ar[i]+"-->"+count);
}
}
}