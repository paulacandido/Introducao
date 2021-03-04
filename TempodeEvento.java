import java.util.Scanner;

public class TempodeEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int horas, minutos,segundos,tempo;
		System.out.println("Digite o tempo do evento em (segundos):");
		tempo = input.nextInt();
		horas = tempo/3600;
		tempo = tempo%3600;
		minutos= tempo/60;
		tempo = tempo%60;
		segundos = tempo;
		System.out.println("O evento tem "+ horas+" horas,"+ minutos+" minutos,"+segundos+" segundos.");

	}

}
