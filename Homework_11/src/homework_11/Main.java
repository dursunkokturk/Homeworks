package homework_11;

public class Main {

	public static void main(String[] args) {
		
		// Double Say�lar�n Toplam�n� Bulma
		// Double Say�lar�n En B�y�k Olan� Bulma
		double[] myList1 = {1.2,1.3,4.3,5.6};
		
		double total1 = 0;
		
		for (double numbers1:myList1) {
			total1 = total1 + numbers1;
			System.out.println(numbers1);
		}
		System.out.println("Total: " + total1);
		
		System.out.println("");
		
		
		
		
		
		double[] myList2 = {1.2,1.3,4.3,5.6};
		
		double total2 = 0;
		
		// Array ��indeki 0 nolu �ndex En B�y�k De�er Kabul Ediliyor 
		double max = myList2[0]; 
		
		for (double numbers2:myList2) {
			if (max<numbers2) {
				max = numbers2;
			}
			total2 = total2 + numbers2;
			System.out.println(numbers2);
		}
		System.out.println("Total: " + total2);
		System.out.println("More Number: " + max);
	}
}