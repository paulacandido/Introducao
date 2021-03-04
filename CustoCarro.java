import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		double custodefabrica;
		System.out.println("Digite o custo de fabrica:");
		custodefabrica = input.nextDouble();
		System.out.println("O custo do consumidor:"+(custodefabrica+(0.28*custodefabrica)+(0.45*custodefabrica)));

	}

}
