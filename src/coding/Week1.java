package coding;

/*
 1) Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.

Examples
ascending("232425") --> true
// Consecutive numbers 23, 24, 25

ascending("2324256") --> false
// No matter how this string is divided, the numbers are not consecutive.

ascending("444445") --> true
// Consecutive numbers 444 and 445.
Notes
A number can consist of any number of digits, so long as the numbers are adjacent to each other, and the string has at least two of them.

2) Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

Examples
squarePatch(3) --> [
[3, 3, 3],
[3, 3, 3],
[3, 3, 3]
]

squarePatch(5) --> [
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5],
[5, 5, 5, 5, 5]
]

squarePatch(1) --> [
[1]
]

squarePatch(0) --> []
Notes
n >= 0.
If n = 0, return an empty array.
 */

public class Week1 {

	public static void main(String[] args) {
		
		//squarePatch(5);
		System.out.println(ascending("444445"));

	}
	
	public static boolean ascending(String s) {
		
		int ind = 1;
		
		String sub1 = "";
		
		String sub2 = "";
		
		boolean res = false;
		
		while(ind<=s.length()/2 && !res) {
			
			sub1 = s.substring(0, ind);
			
			int i = ind;
			
			res = true;
		
			while(i<s.length() && res ) {
						
				sub2 = s.substring(i, Integer.min(ind+i, s.length()));
			
				if(Integer.parseInt(sub1) < Integer.parseInt(sub2)) {
					
					res = true;
					sub1 = sub2;
					i+=ind;
				}
			
				else {
					res = false;
					ind++;
				}
			}	
		}
		
		return res;
	}
	
	public static void squarePatch(int n) {
		
		System.out.println("[");
		
		int [][] arr = new int [n][n];
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("[");
			
			for(int j = 0; j < n; j++) {
				
				arr[i][j] = n;
				
				if(j < n-1) System.out.print(arr[i][j]+", ");
				
				else System.out.print(arr[i][j]);
				
			}
			
			if(i < n-1) System.out.println("],");
			
			else System.out.println("]");
			
		}
		
		System.out.println("]");
	}

}
