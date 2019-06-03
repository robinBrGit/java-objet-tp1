package tp1;

public class Exercice2 {

	public static boolean isNbPerfect(int nb) {
		if (nb <= 1)
			return false;
		int somme = 1;
		for (int i = 2; i < nb; i++) {
			if (nb % i == 0)
				somme += i;
		}
		if (nb == somme)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNbPerfect(6));
		System.out.println(isNbPerfect(28));
		System.out.println(isNbPerfect(30));
	}

}
