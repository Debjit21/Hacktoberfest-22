
package Digital;
import java.util.*;
public class Prog2 
{
    public static void main(String args[])
    {
        int n,k;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter array size ");
        n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element ");
            a[i]=sc.nextInt();
        }
        
        System.out.print("Enter k ");
        k=sc.nextInt();
        
        if(k>(n-1))
        {
            k=k%(n-1);
        }
        
        int c[]=new int[n];
        
        int p=1;
        c[0]=a[0];
        for(int i=0;i<k;i++)
        {
            c[i+1]=a[n-k+i];
        }
        
        for(int i=k+1;i<n;i++)
        {
            c[i]=a[p];
            p++;
        }
        
        System.out.println("Changed array ");
        
        for(int i=0;i<n;i++)
        {
            System.out.print(c[i]+", ");
        }
    }
    
}
