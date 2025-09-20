/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here
		Scanner keyB = new Scanner(System.in);

		public static String decimalToBinary(int decimal){
				String binary = "";

				if (decimal == 0) {
					binary = "0";
				}
				else {

					while(decimal > 0) {
						int rem = decimal % 2;
						binary = remainder + binary;
						decimal = decimal / 2;
					}

				}

				return binary;
				
			}

		public static int binaryToDecimal(String binary) {
			int decimal = 0
			int len = binary.length();

			for (int i = 0; i < len;i++){
				char digit = binary.charAt(i);

				if (digit == "1") {

					decimal += Math.pow(2, length - 1 - i);
					
				}
			}
			
			return decimal;
			
			}
		
		
		System.out.println("If you want a binary conversion type 1 and if you want a decmial conversion type 2");
		Int choice = keyB.nextInt();

		if (!(choice == 1 || choice == 2)){
			System.out.println("your choice was invalid.  Try again please.");
			choice = keyB.nextInt();
		}

		if (choice == 1){
			System.out.print("enter a binary number:");
			String bin = keyB.nextLine();
			int decimal1 = binaryToDecimal(bin);
			System.out.println("Binary Conversion = " + decimal1);
		}
		if (choice ==2){
			System.out.print("enter a decmial number:");
			int dec = keyB.nextInt();
			int binary1 = binaryToDecimal(dec);
			System.out.println("Decimal Conversion = " + binary1);

		
		}
		keyB.close();
		
		
	}

}

