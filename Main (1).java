
import java.util.*; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1: ");
		String str1 = sc.next();
		
		System.out.println("Enter string 2: ");
		String str2 = sc.next();
		
		
		int [] arr1 = new int[26];
		int [] arr2 = new int[26];
		
		for(int i = 0; i< 26; i++){
		    arr1[i] = 0;
		    arr2[i] = 0;
		}
		
		
		
		for(int i = 0; i< str1.length(); i++){
		    arr1[str1.charAt(i) % 97 ] += 1;
		}
		
		for(int i = 0; i< str2.length(); i++){
		    arr2[str2.charAt(i) % 97 ] += 1;
		}
		
		
		for(int i = 0; i< 26; i++){
		    if(arr1[i] != arr2[i]){
		         System.out.println("False");
		    }
		}
		
		System.out.println("True");
	}
}
