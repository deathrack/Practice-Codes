import java.util.*;

class transpose{
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
    
   
    for(int i=0;i<n;i++)
    {
       for(int j=i;j<n;j++)
       {
          int temp=arr1[i][j];
          arr1[i][j]=arr1[j][i];
          arr1[j][i]=temp;
       }
    }
    
    System.out.println("array after transpose  ");
    for(int i=0;i<n;i++)
    {
       for(int j=0;j<n;j++)
       {
          System.out.print(" "+arr1[i][j]);
       }
       System.out.println();
    }
    
  
 }
}
