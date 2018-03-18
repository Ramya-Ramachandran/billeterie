package exceptions;

public class ChampVideException extends RuntimeException {
	public ChampVideException() {
		System.out.println("Au moins un champs n'a pas été rempli !");
	}

}
