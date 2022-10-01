import java.util.*;
public class Practice4
{
    public static void main( String args[])
    {
        int sum=0;
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[5];
        System.out.println("Enter The Numbers: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int j=((arr.length)-1); j>=((arr.length)-2); j--)
        {
            sum = sum+arr[j];
        }
        System.out.println("The Sum Of Two Largest Numbers Is: "+sum);
    }
}