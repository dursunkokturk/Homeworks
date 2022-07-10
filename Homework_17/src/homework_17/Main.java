package homework_17;

public class Main {

	public static void main(String[] args) {
		
		// Mükemmel Sayý 
		// Sayýnýn Kendisi Hariç Kendisine Kadar Olup Tam Bölünen Sayýlarýn Toplamý 
		// Sayýnýn Kendisine Eþit Olmasýdýr
		int number = 28;
		
		int total = 0;
		
		for (int i = 1 ; i < number ; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		
		if (total == number) {
			System.out.println("Mükemmel Sayýdýr");
		}else {
			System.out.println("Mükemmel Sayý Deðildir");
		}
	}
}