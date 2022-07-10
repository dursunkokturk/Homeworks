package homework_14;

public class Main {

	public static void main(String[] args) {
		
		// String ler Ýle Çalýþmak
		String message = "   Bugün Hava Çok Güzel";
		System.out.println(message);
		System.out.println("");
		
		// Cümle Ýçindeki Bir Karakterin Yerine 
		// Baþka Bir Karakter Koyma
		// Yazýnýn Bu Þekilde Düzenlenmiþ Halini Deðiþkene Atama Yaparsak 
		// Ayný Kodlarý Tekrar Yazmaya Gerek Kalmaz
		System.out.println("Cümle Ýçine - Karakteri Koyulmuþ Hali:");
		System.out.println(message.replace(" ", "-"));
		System.out.println("");
		
		// Cümle Ýçindeki Karakterin Belirtilen Ýndex Numarasýndan Ýtibaren 
		// Karakterleri Almak Ýçin Kullanýyoruz.
		System.out.println("Cümle Ýçine Belirtilen Karakterden Sonrasýnýn Alýnmýþ Hali: ");
		System.out.println(message.substring(4));
		System.out.println("");
		
		// Cümle Ýçindeki Belirtilen Ýki Ýndex Numarasý Arasýnda Kalan Karakteri
		// Almak Ýçin Kullanýyoruz.
		System.out.println("Ýki Ýndex Numarasý Arasýnda Kalan Karakterin Alýnmýþ Hali: ");
		System.out.println(message.substring(4,8));
		System.out.println("");
		
		// Cümle Ýçindeki Kelimeleri Belirtilen Belirtilen Duruma Göre
		// Ayýrarak Array Tipinde Yazdýrýyoruz
		System.out.println("Belirtilen Bir Duruman Göre Karakterin Array Tipinde Yazýlmýþ Hali: ");
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		System.out.println("");
		
		// Cümle Ýçindeki Karakterin Hepsinin Küçük Harf Ýle Yazdýrýyoruz
		System.out.println("Cümle Ýçindeki Karakterin Hepsinin Küçük Harf Ýle Yazýlmýþ Hali: ");
		System.out.println(message);
		System.out.println(message.toLowerCase());
		System.out.println("");
		
		System.out.println("");
		
		// Cümle Ýçindeki Karakterin Hepsinin Büyük Harf Ýle Yazdýrýyoruz
		System.out.println("Cümle Ýçindeki Karakterin Hepsinin Büyük Harf Ýle Yazýlmýþ Hali: ");
		System.out.println(message);
		System.out.println(message.toUpperCase());
		System.out.println("");
		
		System.out.println("");
		
		//Cümlenin Baþýndaki Ve Sonundaki Boþluk Karakterlerinin Hepsinin Silinmesi
		System.out.println("Cümlenin Baþýndaki Ve Sonundaki Boþluk Karakterlerinin Hepsinin Silinmiþ Hali: ");
		System.out.println(message);
		System.out.println(message.trim());
		System.out.println("");
	}
}