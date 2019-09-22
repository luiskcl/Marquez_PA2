/*Your application should read a four-digit integer entered by the user
 *  and encrypt it as follows: Replace each digit with the result of adding 7 to the digit 
 *  and getting the remainder after dividing the new value by 10. 
 *  Then swap the first digit with the third, and swap the second digit with the fourth.
 *   Then print the encrypted integer. 
 *   Write a separate application that inputs an encrypted four-digit integer 
 *   and decrypts it (by reversing the encryption scheme)
 *    to form the original number.*/


import java.util.Scanner;
public class encrypted {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int code, interMediate1, interMediate2;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		System.out.println("Enter a 4-digit code: ");
			code = scnr.nextInt();
		
		firstDigit = code / 1000;
		interMediate1 = code % 1000;
		secondDigit = interMediate1 / 100;
		interMediate2 = code % 100;
		thirdDigit = interMediate2 / 10;
		fourthDigit = code % 10;
		
		firstDigit = firstDigit + 7;
		firstDigit = firstDigit % 10;
		
		secondDigit = secondDigit + 7;
		secondDigit = secondDigit % 10;
		
		thirdDigit = thirdDigit + 7;
		thirdDigit = thirdDigit % 10;
		
		fourthDigit = fourthDigit + 7;
		fourthDigit = fourthDigit % 10;
		
		
		System.out.println("Decrypted code: " + code);
		System.out.println("Encrypted: " +  thirdDigit + fourthDigit + firstDigit + secondDigit);
		

	}

}
