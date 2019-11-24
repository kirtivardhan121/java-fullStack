public class Pattern {

public static void main(String[] args) {

int lterm=0,rterm=0;
int N=3;
for(int i=N;i>=1;i--) 
{
for(int j=N;j>i;j--) 
System.out.print(" ");

for(int k=1;k<=i;k++) 
System.out.print(++lterm+"*");

for(int l=1;l<=i;l++) 
{
System.out.print(++rterm+i*i);
if(l!=i) System.out.print("*");
}
System.out.println();
}
}

}