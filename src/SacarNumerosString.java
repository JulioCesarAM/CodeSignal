import java.util.Arrays;

public class SacarNumerosString {
	public static void main(String []ar) {
		String perroflauta="2 apples, 12 oranges";
		System.out.println(numerosenletras(perroflauta));
		
	}
static int numerosenletras (String texto){
	int total=0;
	texto= "2 apples, 12 oranges";
	String solonumeros;
	
	solonumeros=texto.replaceAll("[^0-9]", "");
	char [] fin =solonumeros.toCharArray();
	
	for (int i=0;i<fin.length;i++) {
		total+=Character.getNumericValue(fin[i]);
	}
	
	return total;
	}
}