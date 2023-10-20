package program;

import java.util.Locale;
import java.util.Scanner;

public class resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números deseja digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		 for(int i=0; i<n; i++) {
			 if(vect[i] < 0) {
				 System.out.printf("Numeros negativos: %d\n", vect[i]);
			 }
		 }
		
		
		
		
		
		
		sc.close();
	}

}
