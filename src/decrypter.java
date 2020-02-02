import java.util.Scanner;

public class decrypter {
	
	public static void main(String args[]) {
		
		int number, digit1, digit2, digit3, digit4;
		
		System.out.println("Please enter a four digit encrypted number: ");
		Scanner scnr = new Scanner(System.in);
		
		number = scnr.nextInt();
		digit1 = (number / 1000 + 3) % 10;
        digit2 = (number % 1000 / 100 + 3) % 10;
        digit3 = (number % 100 / 10 + 3) % 10;
        digit4 = (number % 10 + 3) % 10;
        System.out.println("Decrypted number is: " +digit3+digit4+digit1+digit2);
	}

}
