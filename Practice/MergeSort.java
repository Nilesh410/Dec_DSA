public class MergeSort
{
    public static void main(String args[])
    {
        int arr[]={38,27,43,2,9,82,10};
        int left=0;
        int right=arr.length-1;
        MergeSort obj=new MergeSort();
        obj.merge(left,right,arr);
        obj.display(arr,arr.length);
    }
    public void merge(int left,int right,int & arr[])
    {
        while(left<right)
        {
            int mid=(left+right)/2;
            merge(left,mid,arr);
            merge(mid+1,right,arr);
            combine(left,mid,right,arr);

        }
       
    }
    public void combine(int left,int mid,int right,int &arr[])
    {
        int n1=mid-left+1;
        int n2=right-mid;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        while(i<n1&&j<n2)
        {
            if(L[i]<R[j])
            {
                arr[k++]=L[i++];
            }
            else
            {
                arr[k++]=R[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }
    }
    public void display(int & arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}