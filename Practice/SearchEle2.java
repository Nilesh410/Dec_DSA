//Problem Statement:  You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row and each column are sorted in non-decreasing order. But, the first element of a row is not necessarily greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.
// Matrix=
// 1   4   7   11
// 2   5   8   12
// 3   6   9   16
// 10 13  14  17
// Target: 9
// Output: Found at (2,2) (0-indexed
//Brute Force Approach
class Solution
{
    public boolean searchValue(int arr[][],int key)
    {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++)
        {
            if(binarySearch(arr[i],key))
            {
                return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int data[],int key)
    {
        int low=0;
        int high=data.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(data[mid]==key)
                return true;
            if(data[mid]>key)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
}
public class SearchEle2
{  
    public static void main(String args[])
    {
          int arr[][]={{1,2,3},{2,4,8},{5,7,9}};
          Solution obj=new Solution();
          if(obj.searchValue(arr,7))
            System.out.println("True");
          else 
            System.out.println("False");  
    }
}