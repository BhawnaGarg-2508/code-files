
import java.util.*; 
public class Maximum-Subarray-sum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
	
	    System.out.println("Enter the Values: ");
		for(int i = 0; i< n; i++){
		    arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int maxSum = 0;
		
		for(int i = 0; i< n; i++){
		    sum += arr[i];
		    if(sum > maxSum){
		        maxSum = sum;
		    }
		    
		    if(sum <0 ){
		        sum = 0;
		    }
		}
		
		System.out.println("Maximum subarray sum is: " + maxSum);
		
		
	}
}
