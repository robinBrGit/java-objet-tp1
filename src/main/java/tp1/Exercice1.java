package tp1;

import java.util.Random;

public class Exercice1 {

	public static int generateRandom(int max) {
		return generateRandom(0, max);
	}

	public static int generateRandom(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

	public static boolean isNbPremier(int nb) {
		boolean premier = true;
		int diviseur = 2;
		while (premier && diviseur < nb) {
			if (nb % diviseur == 0)
				return false;
			diviseur++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNbPremier(11));
		System.out.println(isNbPremier(78));
		System.out.println(isNbPremier(35));
	}

}
