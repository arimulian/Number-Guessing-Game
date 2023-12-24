package armul.java.game.util;

import java.util.Scanner;

public class InputUtil {

	private static Scanner scanner = new Scanner(System.in);

	public static Integer input ( String message ) {
		System.out.print(message + ": ");
		var line = scanner.nextInt();
		return line;
	}

}
