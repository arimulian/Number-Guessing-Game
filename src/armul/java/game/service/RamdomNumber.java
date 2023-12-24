package armul.java.game.service;

import java.util.Random;

public class RamdomNumber {

	private static   Random random = new Random();
    public static int number = random.nextInt(100);
	public void isNumber(Integer value) {

		if( number > value){
			System.out.println("Terlalu rendah");
		} else if( number < value){
			System.out.println("Terlalu Tinggi");
		} else if (number == value) {
			System.out.println("🚀 Selamat, tebakan anda benar");
		} else {
			System.out.println("Perintah tidak dimengerti");
		}

	}
}
