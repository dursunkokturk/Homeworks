package homework_15;

public class Main {

	public static void main(String[] args) {
		
		// Girilen Say� Asal M�
		int number = -1;
		
		if (number<0) {
			System.out.println("0 Dan B�y�k Pozitif Say� Giriniz");
		}else if (number<2) {
			System.out.println("2 Den K���k Say� Giremezsiniz");
		}else {
			boolean isPrime = true;
			
			for (int i = 2 ; i < number ; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}
			
			if (isPrime) {
				System.out.println("Say� Asald�r");
			}else {
				System.out.println("Say� Asal De�ild�r");
			}
		}
	}
}