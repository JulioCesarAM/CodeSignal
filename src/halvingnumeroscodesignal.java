
public class halvingnumeroscodesignal {

	public static void main(String[] args) {
		int n = 1000;
		System.out.println(prueba(n));

	}

	static int prueba(int n) {
		int sum = n;
		int total = 0;
		do {

			total += sum / 2;
			sum = sum / 2;
			
		} while ((int) sum / 2 != 0);

		return total + n;

	}
}