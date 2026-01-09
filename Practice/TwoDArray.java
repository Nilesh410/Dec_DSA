import java.util.Scanner;
public class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row,clmn;
        System.out.print("Enter the no of row:");
        row=sc.nextInt();
        System.out.print("\n");
        System.out.print("Enter the no of clmn:");
        clmn=sc.nextInt();
        System.out.print("\n");
        int arr[][]=new int[row][clmn];
        // int arr[][]={{2,3,1},{1,2,1},{4,5,6}};

        //Initialize the array 
        System.out.println("Enter the array elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<clmn;j++)
            {
                System.out.print("arr["+i+"]["+j+"]=");
                arr[i][j]=sc.nextInt();
                System.out.println("\n");
            }
        }
        //Display the array elements
        System.out.println("Array Elements are:=");
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<clmn;j++)
            {

                System.out.print(arr[i][j]+" ");  
            }
            System.out.println("\n");
        }
    }
}