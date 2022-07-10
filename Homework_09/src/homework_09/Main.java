package homework_09;

public class Main {

	public static void main(String[] args) {
		
		// Do - While DÖngüsü Ýle Çalýþmak
		// Server Baðlantýsý Gerektiren Durumlarda 
		// Server a Eriþim Saðlanma Kontrolü Ýçin Kullanýlabilir
		int i = 0;
		
		do{
			System.out.println(i);
			i++;
		}
		while(i<10);
		
		System.out.println("Enf Of While");
		
		System.out.println("");
		
		int a = 2;
		do{
			System.out.println(a);
			a+=2;
		}
		while(a<10);
		
		System.out.println("Enf Of While");
	}
}