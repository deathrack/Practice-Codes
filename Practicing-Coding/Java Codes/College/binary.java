import java.util.*;

class binary{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many no.s:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	int i;
	System.out.println("Enter the elements in an array:");

    for ( i = 0; i < n; i++) 
    	arr[i] = sc.nextInt();
    	
    System.out.println("Enter the elements to search:");
    int l = sc.nextInt();
   	
   	int s=0, e=n-1;
   	int m=s-(s-e)/2;
   	while(e>=s){
   	  
    	if(l==arr[m]){
    		System.out.println(" elements found at index :"+m);
    		return;
    		}
    	else if(l<arr[m])
			e=m-1;
		else 
			s=m+1;
	m=s-(s-e)/2;
	}
    		
	
	System.out.println("elements not found !");  
    }	 
    }
            
      

