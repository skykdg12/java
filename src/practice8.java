import java.util.*;

public class practice8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "";
		String output = "";
		char tmp;

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 문자 : ");
		input = sc.nextLine();

		for (int i = 0; i < input.length(); i++) {
			tmp = input.charAt(i);
			if ((tmp >= 65) && (tmp <= 90)) {
				output += input.valueOf(tmp).toLowerCase();

			} else if ((tmp >= 97) && (tmp <= 122)) {
				output += input.valueOf(tmp).toUpperCase();
			}
		}

		System.out.println("변환 : " + output);

	}

}
