import java.util.*;

class matrixmul{
  public static void main(String [] args)
  {
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of rows and col");
    int n=sc.nextInt();
    
    int[][] arr1=new int[n][n];
    System.out.println("Enter the element in array1 ");
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
       {
          arr1[i][j]=sc.nextInt();
       }
    }
    int[][] arr2=new int[n][n];
    System.out.println("Enter the element in array2 ");
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
       {
          arr2[i][j]=sc.nextInt();
       }
    }
    
    int[][] arr3=new int[n][n];
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
       {
          int sum=0;
          for(int k=0;k<n;k++)
          {
             sum=sum+arr1[i][k]*arr2[k][j];
          }
          arr3[i][j]=sum;
       }
    }
    
    System.out.println("array after mul  ");
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
       {
          System.out.print(" "+arr3[i][j]);
       }
       System.out.println();
    }
    
  
 }
}

