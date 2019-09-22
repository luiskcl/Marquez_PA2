import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int NUM_ELEMENTS = 5;
		String []myArray = new String[NUM_ELEMENTS];
		int[][] myArray2 = new int[5][9];
		int i, j;
		myArray[0] = "topic1";
		myArray[1] = "topic2";
		myArray[2] = "topic3";
		myArray[3] = "topic4";
		myArray[4] = "topic5";
		
		System.out.println("Which topic do you want to rate?");
		for(i = 0; i < myArray.length; ++i) {
			
			System.out.println("topic " + myArray[i]);
			
				for(i = 1; i <= 9; ++i) {
					for(j = 0; j < 4; j++) {
						myArray2[i][j] = scnr.nextInt();
						System.out.println(myArray2[i][j]);
					}
					//myArray2[0][0] = scnr.nextInt();
					//myArray2[0][1] = scnr.nextInt();
					}
			
			
			
	}
			
			
		
		

	}

}
