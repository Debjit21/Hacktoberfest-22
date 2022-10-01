public class array
{
    public void func()
    {
        int ar[]={3,5,9,2,6,8,1};
        int cr[]=new int[ar.length];
        
        int k=0,p,c=0,i=0;
        while(i<ar.length)
        {
            p=ar[k];
            if(p>ar[i])
            c++;
            if(i==ar.length)
            {
                i=0;
                cr[k]=c;
                c=0;
                k=k+1;
                if(k<ar.length)
                continue;
                else
                break;
            }
            i++;
        }
        for(i=0;i<cr.length;i++)
        {
            System.out.println(cr[i]);
        }
    }
    public static void main(String args[])
    {
        array ob=new array();
        ob.func();
    }
}