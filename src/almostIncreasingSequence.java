
public class almostIncreasingSequence {

	public static void main(String[] args) {
		int[] tablita = { 1, 2, 3, 3, 4, 5, 6 };
		int[] tablitaD = { 1, 2, 2, 2, 2, 5, 6 };
		int[] tablitat = { 1, 3, 1,3};
		System.out.println("aver");
		System.out.println(almostIncreasingSequenceD(tablitat));

	}

	static boolean almostIncreasingSequenceD(int[] sequence) {
		int i = 0;
		int k = i + 1;
		int error = 0;
		int ultimaPosValida = sequence.length -1 ;
		for (; i < ultimaPosValida && error < 2;) {
			if (i == 0) {
				if (sequence[i] >= sequence[k]) {
					i = k;
					k = i + 1;
					error += 1;
				}
			} 
			else if (i == ultimaPosValida) {
				if (sequence[i] >= sequence[k]) {
					error += 1;
					error = (sequence[i - 1] > sequence[ultimaPosValida] ? error + 1 : error + 0);
				}
			} 
			else {
				if (sequence[i] >= sequence[k]) {
					error += 1;
					if (sequence[i - 1] > sequence[k])
						error += 1;
				}
			}
			i++;
			k=i+1;

		}
		return error<2?true:false;

	}
}
