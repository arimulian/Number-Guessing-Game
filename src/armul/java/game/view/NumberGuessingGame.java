package armul.java.game.view;

import armul.java.game.service.RamdomNumber;
import armul.java.game.util.InputUtil;


public class NumberGuessingGame {
	private static RamdomNumber ramdomNumber = new  RamdomNumber();
		private static int limit = 3;
		public static void view(){
			System.out.println("Number Guessing Started 🚀");
			System.out.println("3x Kesempatan untuk menebak");
			for (int i = 1; i <= limit ; i++) {
				var input = InputUtil.input("Number 1 - 100");
				ramdomNumber.isNumber(input);
				if (i == limit) {
					int number = RamdomNumber.number;
					System.out.println("Number yang harus ditebak: " + number);
				}
			}
		}

	}

