import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
	  
	 public static int binary(int n) {
		 int temp = n;
		 String s = "";
		 while(n != 0) {
			 temp = n % 2;
			 s = Integer.toString(temp) + s ;
			 n = n / 2;
			 
		 }
		
		 return  stringToInt(s);
	    }
	 
	 public static int stringToInt(String s) {
		 int res = 0 , n = 0;
		 while(n < s.length()) {
			 res= res * 10 + s.charAt(n++) - '0';
		 }
		 return res;
	 }
	 
		 
	  public static void main(String[] args) {
	       System.out.println(binary(8));
	  }

	}