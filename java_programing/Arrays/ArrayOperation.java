import java.util.Scanner;
class ArrayOperation
{
int[] readArr()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Elements :");
int n=sc.nextInt();
int ar[]=new int[n];
System.out.println(" Enter "+n+" Elements");
for(int i=0;i<ar.length;i++)
{
ar[i]=sc.nextInt();
}
return ar;
}

void dispArr(int []ar)
{
for(int i=0;i<ar.length;i++)
{
if(i<ar.length-1)
System.out.print(ar[i]+",");
else
System.out.println(ar[i]);
}
}

int[] merge(int []x,int []y)
{
int z[]=new int[x.length+y.length];
for(int i=0;i<x.length;i++)
{
z[i]=x[i];
}
for(int i=0;i<y.length;i++)
{
z[i+x.length]=y[i];
}
return z;
}

public int sumOfArray(int[] a)
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
return sum;
}

int biggestArr(int ar[])
{
int big=ar[0];
for(int i=0;i<ar.length;i++)
{
if(ar[i]>big)
big=ar[i];
}
return big;
}

int[] countEO(int ar[])
{
int count[]={0,0};
for(int i=0;i<ar.length;i++)
{
count[ar[i]%2]++;
}
return count;
}

int[] countPN(int ar[])
{
int count[]={0,0};
for(int i=0;i<ar.length;i++)
{
if(ar[i]>=0)
count[0]++;
else
count[1]++;
}
return count;
}

public int[] sumOfEO(int[] x)
{
int sum[]={0,0};
for(int i=0;i<x.length;i++)
{
if(x[i]%2==0)
sum[0]=sum[0]+x[i];
else
sum[1]=sum[1]+x[i];
}
return sum;
}

int[] mergeSort(int a[],int b[])
{
int c[]=new int[a.length+b.length];
int i=0,j=0,k=0;
while(i<a.length && j<b.length)
{
if(a[i]<b[j])
c[k++]=a[i++];
else
c[k++]=b[j++];
}
while(i<a.length)
{
c[k++]=a[i++];
}
while(j<b.length)
{
c[k++]=b[j++];
}
return c;
}

void reverse(int a[])
{
for(int i=0;i<a.length/2;i++)
{
int t=a[i];
a[i]=a[a.length-1-i];
a[a.length-1-i]=t;
}
}

int[] insertArr(int a[],int ele,int in)
{
if(in<0||in>a.length)
{
System.out.println("Index not in Range");
return a;
}
int n[]=new int[a.length+1];
n[in]=ele;
for(int i=0;i<a.length;i++)
{
if(i<in)
n[i]=a[i];
else
n[i+1]=a[i];
}
return n;
}

int[] deleteArr(int a[],int in)
{
if(in<0||in>=a.length)
{
System.out.println("Index not in range");
return a;
}
int n[]=new int[a.length-1];
for(int i=0;i<a.length;i++)
{
if(i<in)
n[i]=a[i];
else
n[i]=a[i+1];
}
return n;
}

int[] insArr(int a[],int b[],int in)
{
if(in<0||in>a.length)
{
System.out.println("Index not in range");
return a;
}
int n[]=new int[a.length+b.length];
for(int i=0;i<b.length;i++)
{
a[in+1]=b[i];
}
for(int i=0;i<a.length;i++)
{
if(i<in)
n[i]=a[i];
else
n[i+b.length]=a[i];
}
return n;
}

}