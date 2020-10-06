import java.util.*;
class Main 
{ 
	static void segregate0and1(int arr[], int n) 
	{ 
		int count = 0;
	
		for (int i = 0; i < n; i++) 
        { 
			if (arr[i] == 0) 
				count++; 
		} 
		for (int i = 0; i < count; i++) 
			arr[i] = 0; 
		for (int i = count; i < n; i++) 
			arr[i] = 1; 
	} 
	static void print(int arr[], int n) 
	{ 		
		for (int i = 0; i < n; i++) 
			System.out.print(arr[i] + " ");	 
	} 
	public static void main(String[] args) 
	{ 
	    Scanner in = new Scanner (System.in);
	    int n = in.nextInt();
	    int [] arr= new int [n];
	    for(int i=0;i<n;i++)
	        arr[i] = in.nextInt();
		segregate0and1(arr, n); 
		print(arr, n); 
		
	} 
} 
