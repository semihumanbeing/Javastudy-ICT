package mymain;

import java.util.Scanner;

public class _Q02_tree {

	public static void main(String[] args) {
		 int n, i, j, space = 1;
	        System.out.print("Enter the number of rows: ");
	        Scanner s = new Scanner(System.in);
	        n = s.nextInt();
	        space = n - 1;
	        
	        for (j = 1; j <= n; j++) 
	        {
	            for (i = 1; i <= space; i++) 
	            {
	                System.out.print(" ");
	            }
	            space--;
	            for (i = 1; i <= 2 * j - 1; i++) 
	            {
	                System.out.print("*");                
	            }
	            System.out.println("");
	        }
	        space = 4;
	        for (j = 1; j <= n; j++) 
	        {
		    	for (i = 1; i <= space; i++) 
		        {
		            System.out.print(" ");
		        }
		        space--;
		        for (i = 1; i <= 2 * j - 1; i++) 
		        {
		            System.out.print("*");                
		        }
		        System.out.println("");
		    }
	        
	}
	       
	}


