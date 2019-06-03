package tp1;

public class Exercice3 {

	public static boolean isPalindrome(String chaine) {
		if (chaine.length() % 2 == 0)
			return false;

		chaine = chaine.toUpperCase();
		for (int i = 0; i < chaine.length(); i++) {
			if (chaine.charAt(i) != chaine.charAt(chaine.length() - (i + 1)))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("lol"));
		System.out.println(isPalindrome("laval"));
		System.out.println(isPalindrome("kayak"));
		System.out.println(isPalindrome("tombe"));
	}

}
