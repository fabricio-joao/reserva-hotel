package aplicativo;

import java.util.Scanner;

import entidades.Cadastro;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com numero de reservas: ");
		int n = scan.nextInt();
		
		Cadastro[] q = new Cadastro[10];
		
		for(int i=0; i<n; i++) {
			scan.nextLine();
			Cadastro c = new Cadastro();
			System.out.println("Reserva #" + (i+1));
			System.out.print("Nome: ");
			String nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.print("Email: ");
			String email = scan.nextLine();
			c.setEmail(email);
			
			System.out.print("quarto: ");
			int quarto = scan.nextInt();
			c.setQuartos(quarto);
			
			q[quarto] = c;
		}
		System.out.println("Quartos ocupados");
		for(Cadastro x : q) {
			if(x != null) {
				System.out.println(x);	
			}
			//System.out.println(x);
		}
		
		
		scan.close();
	}
}
