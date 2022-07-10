package homework_13;

public class Main {

	public static void main(String[] args) {
		
		// String ler �le �al��mak
		String message = "Bug�n Hava �ok G�zel";
		System.out.println(message);
		System.out.println("");
		
		System.out.println("Total Character Numbers: " + message.length());
		System.out.println("");
		
		System.out.println("5 th Character: " + message.charAt(4));
		System.out.println("");
		
		// concat Fonksiyonunu Tekrar Kullan�rken Ayn� Kodlar� Tekrarlamay� �nlemek ��in 
		// De�i�kene Atamak Gerekiyor
		System.out.println("Yaz�ya Ekleme Yap�lm�� Hali : " + message.concat(" Ya�as�n!"));
		System.out.println("");
		
		// startsWith Fonksiyonunu De�i�ken ��indeki Yaz�n�n 
		// �lk Kelimesinin �lk Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak ��in Kullan�l�r
		System.out.println("Yaz�daki �lk Karakter : " + message.startsWith("B"));
		System.out.println("");
		
		// endsWith Fonksiyonunu De�i�ken ��indeki Yaz�n�n 
		// Son Karakterinin Belirtilen Karakter 
		// Olma Durumunu Sorgulamak ��in Kullan�l�r
		System.out.println("Yaz�daki Son Karakter : " + message.endsWith("."));
		System.out.println("");
		
		// Bir C�mle ��indeki Karakterin �stenildi�i Kadar ki K�sm�n� 
		// index Numaralar� �zerinden
		// �stenilen Karakterden Ba�layarak 
		// Bir De�i�kene Atama Yap�yoruz.
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println("Yaz�dan Aktar�lan Karakterler: " + characters);
		System.out.println("");
		
		// Bir C�mle ��inde Ba�tan Aramaya Ba�layarak 
		// Bir Karakterin index Numaras�n� ��renme 
		// Ayn� Karakterden Ka� Tane Oldu�una Bakmaz
		// Sadece �lk Buldu�u Karakterin index Numaras�n� Verir
		System.out.println("Yaz�daki Aranan A Karakterinin index Numaras�: " + message.indexOf("a"));
		System.out.println("");
		
		// Bir C�mle ��inde Ba�tan Aramaya Ba�layarak 
		// Bir Karakterin index Numaras�n� ��renme 
		// Ayn� Karakterden Ka� Tane Oldu�una Bakmaz
		// Sadece �lk Buldu�u Karakterin index Numaras�n� Verir
		System.out.println("Yaz�daki Aranan E Karakterinin index Numaras�: " + message.lastIndexOf("e"));
	}
}