import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos,meses, dias, idade;
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite sua idade (anos):");		
		anos = input.nextInt();
		System.out.println("Digite sua idade (meses):");
		meses = input.nextInt();
		System.out.println("Digite sua idade (dias):");
		dias = input.nextInt();
		idade = (anos*365)+(meses*30)+dias;
		System.out.println("Você tem "+ idade+ "  dias de idade.");
		
			
			
		

	}

}
