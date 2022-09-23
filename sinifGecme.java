package sinifGecme;
import java.util.Scanner;
public class sinifGecme {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int mat,kimya,muzik,turkce,fizik;
		System.out.println("Turkce notunu giriniz.");
		turkce=scanner.nextInt();
		
		System.out.println("Matematik notunu giriniz.");
		mat=scanner.nextInt();
		
		System.out.println("Fizik notunu giriniz.");
		kimya=scanner.nextInt();
		
		System.out.println("Kimya notunu giriniz.");
		fizik=scanner.nextInt();
		
		System.out.println("Müzik notunu giriniz.");
		muzik=scanner.nextInt();
		
		double ort=(mat+turkce+fizik+kimya+muzik)/5;
		if(ort<=60) {
			System.out.println("Ortalamanız"+ort);
			System.out.println("Kaldiniz");
			
		}
		else {
			System.out.println("Ortalamanız"+ort);
			System.out.println("Geçtiniz");
		}
	}

}
