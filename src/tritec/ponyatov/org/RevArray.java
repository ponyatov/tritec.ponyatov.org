package tritec.ponyatov.org;

import java.util.Random;

public class RevArray {

	static class Reverser {
		static int[] Main(int[] x) {
			int[] y = new int[x.length];
			for (int i = 0; i < x.length; i++)
				y[i] = x[x.length - i - 1];
			return y;
		}
	}

	static void shuffle(int[] x) {
		Random rnd = new Random();
		for (int i = 0; i < x.length; i++) {
			int idx = rnd.nextInt(x.length);
			// swap
			int t = x[i]; x[i] = x[idx]; x[idx] = t;
		}
	}

	public static void main(String[] args) {
		int IN[] = new int[5];
		for (int i = 1; i < IN.length; i++)
			IN[i] = i;
		shuffle(IN);
		int[] OUT = Reverser.Main(IN);
		System.out.println("IN\tOUT\n============\n");
		for (int i = 0; i < IN.length; i++)
			System.out.printf("%d\t%d\n", IN[i], OUT[i]);
	}

}
