import java.util.*;

public class CaeserCipher {
	static int computeShift(char key) {
	    char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		key = Character.toLowerCase(key);

		int shift = 0;
		for(int i = 0; i < alpha.length; i ++) {
			if(key == alpha[i]) {
				shift = i;
				break;
			}
		}
		
		return shift;
	}

	static String encrypt(String input, int shift) {
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		String output = "";
		for(int i = 0; i < input.length(); i ++) {
			char temp = ' ';
			if(Character.isUpperCase(input.charAt(i))) {
				temp = Character.toLowerCase(input.charAt(i));
				for(int j = 0; j < alpha.length; j ++) {
					if(temp == alpha[j]) {
						if(j + shift > alpha.length - 1) {
							int k = (j + shift) - alpha.length;
							temp = alpha[k];
						}
						else {
							temp = alpha[j + shift];
						}
						break;
					}
				}
				output += Character.toUpperCase(temp);
			}
			else if(Character.isLowerCase(input.charAt(i))) {
				temp = input.charAt(i);
				for(int j = 0; j < alpha.length; j ++) {
					if(temp == alpha[j]) {
						if(j + shift > alpha.length - 1) {
							int k = (j + shift) - alpha.length;
							temp = alpha[k];
						}
						else {
							temp = alpha[j + shift];
						}
						break;
					}
				}
				output += temp;
			}
			else {
				output += input.charAt(i);
			}
		}
		
		return output;
	}

	static String decrypt(String input, int shift) {
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		String output = "";
		for(int i = 0; i < input.length(); i ++) {
			char temp = ' ';
			if(Character.isUpperCase(input.charAt(i))) {
				temp = Character.toLowerCase(input.charAt(i));
				for(int j = 0; j < alpha.length; j ++) {
					if(temp == alpha[j]) {
						if(j - shift < 0) {
							int k = (j - shift) + alpha.length;
							temp = alpha[k];
						}
						else {
							temp = alpha[j - shift];
						}
						break;
					}
				}
				output += Character.toUpperCase(temp);
			}
			else if(Character.isLowerCase(input.charAt(i))) {
				temp = input.charAt(i);
				for(int j = 0; j < alpha.length; j ++) {
					if(temp == alpha[j]) {
						if(j - shift < 0) {
							int k = (j - shift) + alpha.length;
							temp = alpha[k];
						}
						else {
							temp = alpha[j - shift];
						}
						break;
					}
				}
				output += temp;
			}
			else
			{
				output += input.charAt(i);
			}
		}
		
		return output;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nPlease enter input to encrypt/decrypt: ");
		String input = scan.nextLine();
		
		System.out.println("\nPlease enter key letter: ");
		String input2 = scan.next();
		char key = input2.charAt(0);
		if(!Character.isLetter(key) || input2.length() > 1) {
			System.err.println("\nERROR: Invalid key letter! Please try again.");
			System.exit(0);
		}

		int shift = computeShift(key);
		
		System.out.println("\nTo encrypt, please enter the letter \'e\' or \'E\'\nTo decrypt please enter the letter \'d\' or \'D\'");
		char ans = scan.next().charAt(0);
		
		String output = "";
		if(Character.toLowerCase(ans) == 'e') {
			output = encrypt(input, shift);
			System.out.println("\nCipher: " + output);
		}
		else if(Character.toLowerCase(ans) == 'd') {
			output = decrypt(input, shift);
			System.out.println("\nDecipher: " + output);
		}
		else {
			System.err.println("\nERROR: Invalid choice letter! Please try again.");
			System.exit(0);
		}

		System.out.println("\nThank you for using my Caeser Cipher program!");
		
		scan.close();
	}
}
