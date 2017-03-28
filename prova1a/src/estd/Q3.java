package estd;

public class Q3 {
	
	public boolean q3(int[] n) {

		int counter = 0;
		for (int i : n) {
			if (i == 2) {
				counter++;
				if (counter == 4) {
					return true;
				}
			}
		}
		return false;
	}
}
