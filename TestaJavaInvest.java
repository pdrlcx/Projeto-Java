package Poupanca;

import java.util.Scanner;

public class TestaJavaInvest {

	public static void main(String[] args) {
		
		JavaInvest poupanca = new JavaInvest();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n          INVESTIMENTO POUPAN�A          \n");
		
		System.out.println("Deseja realizar um investimento na Poupan�a? \n 1 - S  |  2 - N");
		char resp = leia.next().charAt(0);
		
		if(resp == 'S' || resp == 's') {
			while(poupanca.getValorDepositado() < 50.00) {
				System.out.println("Quanto deseja investir? (Valor m�nimo R$50,00)");
				poupanca.setValorDepositado(leia.nextDouble());
		
				if(poupanca.getValorDepositado() < 50.00) {
					System.out.println("Erro!\nValor m�nimo R$50,00!");
		
				}
			}
			poupanca.setPoupancaTotal(poupanca.getValorDepositado() * 0.02 * 12);
			System.out.println("O rendimento do valor investido � " + poupanca.getPoupancaTotal());
		}		

		System.out.println("Deseja realizar mais algum investimento? (S/N)");
		leia.close();
	}

}
