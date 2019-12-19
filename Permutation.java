package permutation;

/*
 * CSC3420 - Spring 2015
 * Sidney Seay - sseay5@student.gsu.edu
 * DateDue: 02-12-2015
 * Assignment: 2
 * File(s): Permutation.java
 */
//In this program, you should enter in a string, 
//and it will print out its permutations
//If you type 3 letters, it should print 6 permutations. 
//If you type 4 letters, it should print 24
//permutations. The number of permutations is the number 
//of letters*factorial

import java.awt.*;
import java.io.*;
import java.util.*;

public class Permutation {

    // constructor
    public Permutation() {

        }

    //
    // main routine
    //
    public static void main(String[] args){
        // define scanner for accepting console input
    	Scanner scan = new Scanner( System.in );  
        // define string fields used in method permutation
        String strValue = "";
        String str = "";        
        // display console message
        System.out.println("Please enter a string: ");
        // initialize scanner
		scan = new Scanner(System.in);
        // accept console input
		str = scan.nextLine();
        // call method permutation
		// pass parameter empty string and console input string
		permutation(strValue, str.trim());
		
      }
		
	/*
        Perform string permutation
    */
		private static void permutation(String sValue, String strInput) {
			int iLen = strInput.length();
	        // check length of string
			// iLen = 0 then print string
			// iLen > 0 then perform recursive call to method permutation
			// until iLen = 0
			if (iLen == 0) {
				// print the permutation string
		        System.out.println(sValue);				
			}
			else {
		    	for (int i = 0; i < iLen; i++) {
		    		// recursive call to method permutation
		    		//
		    		// pass current string position and next string position
		    		// to method permutation
		    		//
		    		permutation(sValue + strInput.charAt(i), strInput.substring(0, i)+ strInput.substring(i + 1));
		    	}
			}
		}
	}
