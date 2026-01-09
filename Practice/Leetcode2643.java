public class Leetcode2643
{
    public static void main(String args[])
    {
        int arr[][]={{1,0,0},{1,1,1},{1,1,1}};
        int result[]=rowMaxOne(arr);
        System.out.println("result=["+result[0]+","+result[1]+"]");
    }
    public static int [] rowMaxOne(int arr[][])
    {
        int index=-1;
        int maxCount=0;
        for(int i=0;i<arr.length;i++)
        {
            int currentOneCount=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                    currentOneCount++;
            }
            if(currentOneCount>maxCount)
            {
                maxCount=currentOneCount;
                index=i;
            }
        }
        return  new int[]{index, maxCount};
    }
}