
public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] scores = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int score : scores[i]) {
				sum += score;
			}

			System.out.println(String.format("[%d] sum : %d, avg : %d", i + 1, sum, sum / scores[i].length));
		}

	}
}
