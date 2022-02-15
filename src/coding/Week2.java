package coding;

/*
Create a function that takes the memory size (ms is a string type) as an argument and returns the actual memory size.

Examples
actualMemorySize("32GB") --> "29.76GB"

actualMemorySize("2GB") --> "1.86GB"

actualMemorySize("512MB") --> "476MB"

Notes
-The actual storage loss on a USB device is 7% of the overall memory size!
-If the actual memory size was greater than 1 GB, round your result to two decimal places.
-If the memory size after adjustment is smaller then 1 GB, return the result in MB. 
*/

public class Week2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		actualMemorySize("32GB");
		actualMemorySize("2GB");
		actualMemorySize("512MB");

	}
	
	public static void actualMemorySize(String ms) {
		
		String actualSize = "";
		String mem = ms.substring(ms.length()-2);
		Double size = Double.parseDouble(ms.substring(0, ms.length()-2));
		
		size*=0.93;
		if(size > 1 && mem.equals("GB")) {
			
			actualSize = String.format("%.2f", size) + mem;
		}
		
		else if(mem.equals("GB")){
			
			size*=1024;
			mem = "MB";
			actualSize = String.format("%.0f", size) + mem;
		}
		
		else actualSize = String.format("%.0f", size) + mem;
		
		System.out.println(actualSize);
		
	}

}
