import java.util.*;
class sum{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many no.s:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	int i;
	System.out.println("Enter the elements in an array:");
    for ( i = 0; i < n; i++) 
    	arr[i] = sc.nextInt();
    int s1=0,s2=0;
    for ( i = 0; i < n; i++) {
    	if(arr[i]%2==0)
    		s1=s1+arr[i];
    	else
    		s2=s2+arr[i];
    		}
	System.out.println("Sum of even elements is :"+s1);  
    System.out.println("Sum of odd elements is :"+s2);
    }	 
    }
