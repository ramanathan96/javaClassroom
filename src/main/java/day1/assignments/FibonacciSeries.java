package day1.assignments; 
 
 
 public class FibonacciSeries { 
 	 
	/* 
6 	 * Goal: To find Fibonacci Series for a given range 
7 	 *  
8 	 * input(range): 8 
9 	 * output: 0, 1, 1, 2, 3, 5, 8, 13 
10 	 *  
11 	 * Shortcuts: 
12 	 * 1) Print : type: syso, followed by: ctrl + space + enter 
13 	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter 
14 	 *    
15 	 * What are my learnings from this code? 
16 	 * 1) 
17 	 * 2) 
18 	 * 3)  
19 	 *  
20 	 */ 
 	 
 	public static void main(String[] args) { 
 		 
 		// initialize 3 int variables (Tip: range & firstNum, secNum in the series) 
 		 
 		// Iterate from 1 to the range 
 		 
 			// Print first number  
 			 
 			// add first and second number 
 			 
 			// Assign second number to the first number 
 			 
 			// Assign sum to the second number 
 		int a= 0;
 		int b=1;
 		int c=a+b;
 		for (int i=0;i<=4;++i)
 		{
 			a=b;
 			b=c;
 			c=a+b;
 			System.out.println(c);
 			
 		}
 	}  
 
 } 
