import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numArr[] = null;
		int sum;
		double average;
		int count;
		sum = 0;
		System.out.println("연산하고 싶은 숫자의 갯수 = ");
		count = sc.nextInt();
		numArr = new int[count];
		for (int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "번째 수 =");
			numArr[i] = sc.nextInt();
		}
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		average = (double) sum / numArr.length;

		for (int i = 0; i < numArr.length; i++) {
			System.out.print("숫자들" + numArr[i] + " ");
		}
		System.out.println();

		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + average);

	}

}
