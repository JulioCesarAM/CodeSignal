import java.util.stream.IntStream;

public class elproductordeloselementosadjacentesmayor {
	public static void main(String[] ar) {
		int[] tabla = { -23, 4, -3, 8, -12};
		;
		System.out.println(adjacentElementsProduct(tabla));
	}

	static int adjacentElementsProduct(int[] inputArray) {
		int max = Integer.MIN_VALUE;
		int prueba = 1;
		int aba = 0;
		for (int i = 0; i < inputArray.length; i++) {
			aba = i + 1;
			if (aba < inputArray.length) {
				prueba = (inputArray[i] * inputArray[aba]);
				
				if (prueba > max) {
					max = prueba;
				}
			}
		}
		return max;
	}
	int adjacentElementsProductt(int[] inputArray) {
	    return IntStream.range(1, inputArray.length).map(i->inputArray[i]*inputArray[i-1]).max().getAsInt();}
}