import java.util.*;

public class practice10 {

	static int add(int a, int b) {
		return a + b;
	}

	static int subtract(int a, int b) {
		return a - b;
	}

	static int divide(int a, int b) {
		return a / b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3 + 5 - 2 * 2 / 3 = " + divide(multiply(subtract(add(3, 5), 2), 2), 3));

	}

}
