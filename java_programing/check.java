import java.util.Scanner;
class Check{

public static void main(String args[])
{
   int i, j; 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
   for(i = 1; i<=n; i++)   
   {       
       for(j = i-1; j<n; j++)       
       {           
              System.out.print(i);    
       }      
      System.out.println();  
   }
}
}