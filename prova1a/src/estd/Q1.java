package estd;

public class Q1 {

	public boolean q1(int[] n) {
		for (int j = 0; j < n.length; j++) {
			if ((j+1) < n.length && j == 2 && n[j + 1] == 2) {
				return true;
			}
		}
		return false;
	}

}
