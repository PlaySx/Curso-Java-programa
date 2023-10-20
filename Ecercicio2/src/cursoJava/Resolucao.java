package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma, media;
		System.out.print("Quantos números deseja digitar?");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		media = soma / n;
		
		System.out.print("Valores = ");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.printf("\nSoma = %.2f\n", soma);
		System.out.printf("Media = %.2f\n", media);
	
		
		
		
		
		
		
		
		
        sc.close();
	}

}
