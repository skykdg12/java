import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempc;
		int tempf;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("¼·¾¾ ¿Âµµ : ");
		tempc = (int) sc.nextFloat();
		tempf = tempc *  9/ 5 + 32;
		System.out.println("È­¾¾ ¿Âµµ : " + tempf);

	}

}