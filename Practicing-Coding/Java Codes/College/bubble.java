import java.util.*;

class bubble{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many no.s:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	int i,j;
	System.out.println("Enter the elements in an array:");

    for ( i = 0; i < n; i++) 
    	arr[i] = sc.nextInt();
    
    for ( i = 0; i < n-1; i++){
    	for ( j = 0; j < n-1; j++){
    		if(arr[j+1]<arr[j]){
    			int t=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=t;
    			}   	
    	}
	}
	System.out.println("Sorted order is :");
	
	for ( i = 0; i < n; i++) 
		System.out.print(arr[i]+" ");
	
    }	 
    }
            
      

