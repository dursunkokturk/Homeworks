package homework_14;

public class Main {

	public static void main(String[] args) {
		
		// String ler �le �al��mak
		String message = "   Bug�n Hava �ok G�zel";
		System.out.println(message);
		System.out.println("");
		
		// C�mle ��indeki Bir Karakterin Yerine 
		// Ba�ka Bir Karakter Koyma
		// Yaz�n�n Bu �ekilde D�zenlenmi� Halini De�i�kene Atama Yaparsak 
		// Ayn� Kodlar� Tekrar Yazmaya Gerek Kalmaz
		System.out.println("C�mle ��ine - Karakteri Koyulmu� Hali:");
		System.out.println(message.replace(" ", "-"));
		System.out.println("");
		
		// C�mle ��indeki Karakterin Belirtilen �ndex Numaras�ndan �tibaren 
		// Karakterleri Almak ��in Kullan�yoruz.
		System.out.println("C�mle ��ine Belirtilen Karakterden Sonras�n�n Al�nm�� Hali: ");
		System.out.println(message.substring(4));
		System.out.println("");
		
		// C�mle ��indeki Belirtilen �ki �ndex Numaras� Aras�nda Kalan Karakteri
		// Almak ��in Kullan�yoruz.
		System.out.println("�ki �ndex Numaras� Aras�nda Kalan Karakterin Al�nm�� Hali: ");
		System.out.println(message.substring(4,8));
		System.out.println("");
		
		// C�mle ��indeki Kelimeleri Belirtilen Belirtilen Duruma G�re
		// Ay�rarak Array Tipinde Yazd�r�yoruz
		System.out.println("Belirtilen Bir Duruman G�re Karakterin Array Tipinde Yaz�lm�� Hali: ");
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println("");
		
		// C�mle ��indeki Karakterin Hepsinin K���k Harf �le Yazd�r�yoruz
		System.out.println("C�mle ��indeki Karakterin Hepsinin K���k Harf �le Yaz�lm�� Hali: ");
		System.out.println(message);
		System.out.println(message.toLowerCase());
		System.out.println("");
		
		System.out.println("");
		
		// C�mle ��indeki Karakterin Hepsinin B�y�k Harf �le Yazd�r�yoruz
		System.out.println("C�mle ��indeki Karakterin Hepsinin B�y�k Harf �le Yaz�lm�� Hali: ");
		System.out.println(message);
		System.out.println(message.toUpperCase());
		System.out.println("");
		
		System.out.println("");
		
		//C�mlenin Ba��ndaki Ve Sonundaki Bo�luk Karakterlerinin Hepsinin Silinmesi
		System.out.println("C�mlenin Ba��ndaki Ve Sonundaki Bo�luk Karakterlerinin Hepsinin Silinmi� Hali: ");
		System.out.println(message);
		System.out.println(message.trim());
		System.out.println("");
	}
}