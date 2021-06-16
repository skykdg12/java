import java.util.*;

public class practice9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		int number[] = null;
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("합의 수 : ");
		count = sc.nextInt();

		number = new int[count];
		for (int i = 1; i < number.length; i++) {
			System.out.print(i + "번째 수 =");
			number[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(number));
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println("합계 = " + sum);
	}
}