/*Code Challenge 3: Exceptions*
Prompt user for a string and a number.
Use charAt to print out the character in the string at the position given by the number.
If the user doesn’t type a number, print an error message “Not a number”.
If the user enters a number that is too big small, charAt will throw an exception. 
Catch it and print an error message “That location is invalid for this string.”
Bonus: use a loop to keep asking the user until the input is valid.
*/
package codechallenge3Day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CodeChallenge3Day9 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String userString="", choice="y";
		int userNumber=0;
		boolean isValid=false;
		char charAt=' ';
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.print("Please enter a word : ");
			userString = sc.nextLine();
			do {
				System.out.print("Enter a number to extract the character at: ");
				try {
					userNumber = sc.nextInt();
					System.out.println(userString.charAt(userNumber-1));
					isValid=true;				
				}catch(InputMismatchException ex) {
					System.out.println("Not a number!");
					sc.nextLine();
					continue;			
				} catch(IndexOutOfBoundsException ex) {
					System.out.println("That location is invalid for this string.");
					sc.nextLine();
					continue;
				}
			} while(!isValid);
			
			System.out.print("Would you like to continue? (y/n): ");
			choice = sc.next();
			sc.nextLine();
		
		}
	}

}
