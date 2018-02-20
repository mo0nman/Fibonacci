package lahvinsPlayground;

import java.util.Scanner;

public class ArraySizeandMaxValue {

	public static int[] printArrayPattern(int num) {
	
		
		int[] numArray = new int[num];
		
		
		if(numArray.length == 1) {
			numArray[0] = 0;
		}else {
			numArray[0] = 0;
			numArray[1] = 1;
		}
		
				for(int i=2;i<numArray.length;i++) {
					numArray[i] = numArray[i-2] + numArray[i-1];
				}
				
			return numArray;
	}
	
	
	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		
		System.out.print("Enter Size of Array: ");
		int userInput = ss.nextInt();
		
		while(true) {
			if(userInput > 12 || userInput <=0) {
				System.out.print("Invalid size. Please input from 0-12: ");
				userInput = ss.nextInt();
			}else {
				break;
			}
		}
		
		int[] userArr = printArrayPattern(userInput);
			
			for(int i=0;i<userArr.length;i++) {
				if(i != userArr.length-1) {
					System.out.print(userArr[i] + ", ");
				}else {
					System.out.println(userArr[i] + "\n");
				}
			}
			
			System.out.println("Enter Max Value: ");
			int numChecker = ss.nextInt();
			
			for(int j=0;j<userArr.length;j++) {
				if(userArr[j] <= numChecker) {
					System.out.print(userArr[j] + " ");
				
			}
		}	
			
  }
}
