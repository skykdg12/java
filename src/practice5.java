import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.print("���� : A");
		} else if (score >= 80) {
			System.out.print("���� : B");
		} else if (score >= 70) {
			System.out.print("���� : C");
		} else if (score >= 60) {
			System.out.print("���� : D");
		} else if (score >= 50) {
			System.out.print("���� : E");
		} else {
			System.out.print("���� : F");
		}

	}

}
