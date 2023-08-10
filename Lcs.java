
import java.util.*; 
public class Lcs
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1 = sc.next();
		
		int n = str1.length();
		
		System.out.println("Enter the second string: ");
		String str2 = sc.next();
		int m = str2.length();
		
		int [][] arr = new int[n][m];
	    int maxval = 0;
	    int l = 0;
	    int r = 0;
	    
	    
		for(int i = 0; i< n; i++){
		    for(int j = 0; j<m ; j++){
		        if(str1.charAt(i) == str2.charAt(j)){
		            if(i-1 > 0 && j-1 >0){
		                arr[i][j] = arr[i-1][j-1] + 1;
		            }
		            
		            else{
		                arr[i][j] = 1;
		            }
		            
		            if(arr[i][j] > maxval){
		                    maxval = arr[i][j];
		                    l = i;
		                    r = j;
		            }
		        }
		        
		        else{
		            arr[i][j] = 0;
		        }
		    }
		}
		
		
		int p = l- arr[l][r];
		int q = r- arr[l][r];
		
		String ans = "";
		
		while(p <= l){
		    ans += str1.charAt(p);
		    p++;
		}
		
		
		
		System.out.println("LCS is: " + ans);
		
		
	}
}
