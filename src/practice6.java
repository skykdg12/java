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
		System.out.println("�����ϰ� ���� ������ ���� = ");
		count = sc.nextInt();
		numArr = new int[count];
		for (int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "��° �� =");
			numArr[i] = sc.nextInt();
		}
		for (int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		average = (double) sum / numArr.length;

		for (int i = 0; i < numArr.length; i++) {
			System.out.print("���ڵ�" + numArr[i] + " ");
		}
		System.out.println();

		System.out.println("�հ� = " + sum);
		System.out.println("��� = " + average);

	}

}
