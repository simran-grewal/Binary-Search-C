/**
 * Created by i_amg on 24-05-2017.
 */
import java.io.*;
class job
{
    static void JS(int d[],int j[],int n,int p[])throws IOException
    {
        int profit=0;
        j[1]=1;
        int              k=1,r;
        for(int i=1;i<=n;i++)
        {
            r=k;
            while((d[j[r]]>d[i]) && (d[j[r]]!=r))
                r=r-1;
            if(d[j[r]]<=d[i] && d[i]>r)
            {
                for(int q=(k);q>=(r+1);q--)
                {
                    if(q==-1)
                        break;
                    j[q+1]=j[q];
                }
                j[r+1]=i;
                k=k+1;
            }
        }
        for(int m=1;m<=(k+1);m++)
        {
            profit+=p[m];
        }
        System.out.println("MAXIMUM PROFIT:"+profit);
    }

    public static void main(String args[])throws IOException
    {
        DataInputStream b=new DataInputStream(System.in);

        int n,p[],d[],i,j[];
        System.out.println("enter no of processes");
        n=Integer.parseInt(b.readLine());
        p=new int[n+1];
        d=new int[n+1];
        j=new int[n+1];
        d[0]=j[0]=0;
        for(i=1;i<=n;i++)
        {
            System.out.println("enter profit of process "+(i));
            p[i]=Integer.parseInt(b.readLine());
        }

        for(i=1;i<=n;i++)
        {
            System.out.println("enter deadline ");
            d[i]=Integer.parseInt(b.readLine());
            j[i]=0;
        }
        for(i=n-1;i>0;i--)
            for(int q=1;q<=i;q++)
                if(p[q]<p[q+1])
                {
                    int t;
                    t=p[q];
                    p[q]=p[q+1];
                    p[q+1]=t;
                }
        System.out.println("Profits");
        for(i=1;i<=n;i++)
            System.out.println(p[i]);
        JS(d,j,n,p);

    }
}