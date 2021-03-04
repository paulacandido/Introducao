import java.util.Scanner;

public class EquacoesLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A,B,C,D,E,F;
		double x,y;
		System.out.println("Digite A:");
		A = input.nextInt();
		System.out.println("Digite B:");
		B = input.nextInt();
		System.out.println("Digite C:");
		C = input.nextInt();
		System.out.println("Digite D:");
		D = input.nextInt();
		System.out.println("Digite E:");
		E = input.nextInt();
		System.out.println("Digite F:");
		F = input.nextInt();
		y = (((A*F)-(C*D))/((A*E)-(B*D)));
		x = (((C*E)-(B*F))/((A*E)-(B*D)));
		System.out.println("X ="+x+" Y="+y);

	}

}
