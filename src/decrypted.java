import java.util.Scanner;
public class decrypted {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int code, interMediate1, interMediate2;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		System.out.println("Enter an encrypted 4-digit code: ");
			code = scnr.nextInt();
			
			firstDigit = code / 1000;
			interMediate1 = code % 1000;
			secondDigit = interMediate1 / 100; 
			interMediate2 = code % 100;
			thirdDigit = interMediate2 / 10;
			fourthDigit = code % 10;
			
			firstDigit = firstDigit + 10;
			firstDigit = firstDigit - 7;
			
			secondDigit = secondDigit + 10;
			secondDigit = secondDigit - 7;
			
			thirdDigit = thirdDigit + 10;
			thirdDigit = thirdDigit - 7;
			
			fourthDigit = fourthDigit + 10;
			fourthDigit = fourthDigit - 7;
			
		System.out.println(firstDigit);
		System.out.println("Encrypted code: " + code);	
		System.out.println("Decrypted: " +  thirdDigit + fourthDigit + firstDigit + secondDigit);
			
			
			

	}

}
