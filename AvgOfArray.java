public class AvgOfArray
{
    public static void main(String args[])
    {
        int sum=0,a[]={12,11,13,14,15};
        for(int i=0;i<5;i++)
        {
            sum=sum+a[i];
        }
        sum=sum/5;
        System.out.println(+sum);
    }
}