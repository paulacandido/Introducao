import java.util.Scanner;

public class Pontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1,x2,y1,y2;
	
		System.out.println("Digite x1:");
		x1 = input.nextInt();
		System.out.println("Digite y1:");
		y1 = input.nextInt();
		System.out.println("Digite x2:");
		x2 = input.nextInt();
		System.out.println("Digite y2:");
		y2= input.nextInt();
		System.out.println(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
		

	}

}
