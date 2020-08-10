/*
Day 0: Hello, World.
Task
To complete this challenge, you must save a line of input from stdin to a variable, print Hello, World. on a single line, and finally print the value of your variable on a second line.
Note: The instructions are Java-based, but we support submissions in many popular languages. You can switch languages using the drop-down menu above your editor, and the inputString variable may be written differently depending on the best-practice conventions of your submission language.
Input Format
A single line of text denoting inputString (the variable whose contents must be printed).
Output Format
Print Hello, World. on the first line, and the contents of inputString on the second line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
        System.out.println(inputString);
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
	}
}
