import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double a,b,c,media;
		System.out.println("Escreva a primeira nota(peso 2)");
		a = input.nextDouble();
		System.out.println("Escreva a segunda nota(peso 3)");
		b = input.nextDouble();
		System.out.println("Escreva a terceira nota(peso 5)");
		c = input.nextDouble();
		media=(((a*2)+(b*3)+(c*5))/10);
		System.out.println("A media ponderada é "+media);

	}

}
