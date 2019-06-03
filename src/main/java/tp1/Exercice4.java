package tp1;

import java.util.Random;
import java.util.Scanner;

public class Exercice4 {

	public static void justePrix() {
		int nbUtil;
		int conteur = 0;
		Random rand = new Random();
		int justePrix = rand.nextInt(1000 - 0 + 1) + 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrer un nombre entre 0 et 1000 :");
		nbUtil = scanner.nextInt();
		while (justePrix != nbUtil) {
			if (nbUtil < justePrix)
				System.out.println("C'est + :");
			else
				System.out.println("C'est - :");
			nbUtil = scanner.nextInt();
			conteur++;
		}
		System.out.println("Bravo ! vous avez gagné en " + conteur + " essai(s)");
		scanner.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		justePrix();
	}

}
