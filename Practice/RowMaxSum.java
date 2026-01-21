//Find the row index that has maximum summation result of their element

public class RowMaxSum
{
    public static void main(String args[])
    {
        int arr[][]={{1,0,0},{1,2,1},{1,1,1}};
        int result[]=rowWithMaxSum(arr);
        System.out.println("result=["+result[0]+","+result[1]+"]");
    }
    public static int [] rowWithMaxSum(int arr[][])
    {
        int index=-1;
        int maxSum=0;
        for(int i=0;i<arr.length;i++)
        {
            int currentSum=0;
            for(int j=0;j<arr[0].length;j++)
            {
                currentSum=currentSum+arr[i][j];
            }
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
                index=i;
            }
        }
        return  new int[]{index, maxSum};
    }
}