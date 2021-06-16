import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.print("학점 : A");
		} else if (score >= 80) {
			System.out.print("학점 : B");
		} else if (score >= 70) {
			System.out.print("학점 : C");
		} else if (score >= 60) {
			System.out.print("학점 : D");
		} else if (score >= 50) {
			System.out.print("학점 : E");
		} else {
			System.out.print("학점 : F");
		}

	}

}
