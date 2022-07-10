package homework_13;

public class Main {

	public static void main(String[] args) {
		
		// String ler Ýle Çalýþmak
		String message = "Bugün Hava Çok Güzel";
		System.out.println(message);
		System.out.println("");
		
		System.out.println("Total Character Numbers: " + message.length());
		System.out.println("");
		
		System.out.println("5 th Character: " + message.charAt(4));
		System.out.println("");
		
		// concat Fonksiyonunu Tekrar Kullanýrken Ayný Kodlarý Tekrarlamayý Önlemek Ýçin 
		// Deðiþkene Atamak Gerekiyor
		System.out.println("Yazýya Ekleme Yapýlmýþ Hali : " + message.concat(" Yaþasýn!"));
		System.out.println("");
		
		// startsWith Fonksiyonunu Deðiþken Ýçindeki Yazýnýn 
		// Ýlk Kelimesinin Ýlk Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak Ýçin Kullanýlýr
		System.out.println("Yazýdaki Ýlk Karakter : " + message.startsWith("B"));
		System.out.println("");
		
		// endsWith Fonksiyonunu Deðiþken Ýçindeki Yazýnýn 
		// Son Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak Ýçin Kullanýlýr
		System.out.println("Yazýdaki Son Karakter : " + message.endsWith("."));
		System.out.println("");
		
		// Bir Cümle Ýçindeki Karakterin Ýstenildiði Kadar ki Kýsmýný 
		// index Numaralarý Üzerinden
		// Ýstenilen Karakterden Baþlayarak 
		// Bir Deðiþkene Atama Yapýyoruz.
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println("Yazýdan Aktarýlan Karakterler: " + characters);
		System.out.println("");
		
		// Bir Cümle Ýçinde Baþtan Aramaya Baþlayarak 
		// Bir Karakterin index Numarasýný Öðrenme 
		// Ayný Karakterden Kaç Tane Olduðuna Bakmaz
		// Sadece Ýlk Bulduðu Karakterin index Numarasýný Verir
		System.out.println("Yazýdaki Aranan A Karakterinin index Numarasý: " + message.indexOf("a"));
		System.out.println("");
		
		// Bir Cümle Ýçinde Baþtan Aramaya Baþlayarak 
		// Bir Karakterin index Numarasýný Öðrenme 
		// Ayný Karakterden Kaç Tane Olduðuna Bakmaz
		// Sadece Ýlk Bulduðu Karakterin index Numarasýný Verir
		System.out.println("Yazýdaki Aranan E Karakterinin index Numarasý: " + message.lastIndexOf("e"));
	}
}