package homework_17;

public class Main {

	public static void main(String[] args) {
		
		// M�kemmel Say� 
		// Say�n�n Kendisi Hari� Kendisine Kadar Olup Tam B�l�nen Say�lar�n Toplam� 
		// Say�n�n Kendisine E�it Olmas�d�r
		int number = 28;
		
		int total = 0;
		
		for (int i = 1 ; i < number ; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		
		if (total == number) {
			System.out.println("M�kemmel Say�d�r");
		}else {
			System.out.println("M�kemmel Say� De�ildir");
		}
	}
}