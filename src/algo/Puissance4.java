package algo;

import java.util.ArrayList;

public class Puissance4 {

	public static void main(String[] args) {

		ArrayList<Integer>[] plateau = new ArrayList[7];
		for (int i = 0; i < 7; i++) {
			plateau[i] = new ArrayList<Integer>();
		}

		if (plateau[2].size() < 6) {
			plateau[2].add(2);
		}

	}

}
