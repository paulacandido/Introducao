import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A,B,C;
		double D;
		System.out.println("Digite A:");
		A = input.nextInt();
		System.out.println("Digite B:");
		B = input.nextInt();
		System.out.println("Digite C:");
		C = input.nextInt();
		D = ((Math.pow(A+B, 2)+Math.pow(C+B, 2))/2);
		System.out.println(D);

	}

}
