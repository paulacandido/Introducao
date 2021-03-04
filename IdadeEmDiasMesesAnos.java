import java.util.Scanner;

public class IdadeEmDiasMesesAnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int anos, meses, dias,idade;
		System.out.println("Digite sua idade em (dias):");
		idade = input.nextInt();
		anos = idade/365;
		idade = idade%365;
		meses = idade/30;
		idade = idade%30;
		dias = idade;
		System.out.println("Você tem "+ anos+" anos,"+meses+" meses,"+ dias+" dias.");

	}

}
