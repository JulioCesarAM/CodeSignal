import java.util.Scanner;

public class Palindrome {
	public static void main(String[] ar) {
		boolean prueba = false;
		String A;
		Scanner sc = new Scanner(System.in);
		A = sc.nextLine();
	
	
		if (!A.equals(null) && !A.equals("") ) {
			A = A.replaceAll("\\s+", "");
			int b = A.length() - 1;
			int i = 0;

			for (i = 0; i <A.length() && b >= 0 ; i++) {
				if (A.charAt(i)==A.charAt(b)) {
					prueba=true;
				}
				else {
					prueba=true;}
				b = b - 1;
			}
			
			System.out.println(checkPalindromet(A) + "" + prueba);

		} else {
			prueba = false;}
		System.out.println(checkPalindrome(A));
	}		

	static boolean checkPalindrome(String inputString) {
		
		boolean prueba = false;
			int i = 0;
		if (!inputString.equals(null) && !inputString.equals("") ) {
			inputString = inputString.replaceAll("\\s+", "");
			int b = inputString.length() - 1;
			
			for (i = 0; (inputString.charAt(i) == inputString.charAt(b)) && b > 0 && i < inputString.length(); i++) {

				b = b - 1;
			}
			if (i == inputString.length() - 1) {
				prueba = true;
			} else {
				prueba = false;
			}
		} else {
			prueba = true;
		}
		return prueba;

	}
	static boolean checkPalindromet(String inputString) {
	    return inputString.equals(new StringBuilder(inputString).reverse().toString());
	}


}
