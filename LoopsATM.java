package LoopsATM;
import java.util.Scanner;

public class LoopsATM {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bakiye = 1000;
		System.out.println("-----------------------");
		String islemler = "1. işlem: Bakiye sorma\n"
				         +"2. işlem: Para Çekme\n"
				         +"3. işlem: Para Yatırma\n"
				         +"4. işlem: Çıkış için q'ya basın";
		System.out.println(islemler);
		System.out.println("-----------------------");
		
				
		while(true) {
			System.out.println("\nİşleminizi seçiniz...");
			String islem = scanner.nextLine();

			if(islem.equals("q")) {
				System.out.print("Çıkış yapıyorsunuz...");
				break;
				
			}else if(islem.equals("1")) {
				System.out.print("Bakiyeniz:" + bakiye);
				
			}else if(islem.equals("2")) {
				System.out.print("Çekmek istediğiniz tutar giriniz:");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				if(bakiye-tutar<0) {
					System.out.print("Yetersiz Bakiye..."+ bakiye);
					
				}else {
					bakiye-=tutar;
					System.out.print("İşlemden sonraki bakiyeniz:"+ bakiye);
				}
				
			}else if(islem.equals("3")) {
				System.out.print("Yatırmak istediğiniz tutarı aşağıda bulunan para girişine yatay şekilde gerçekleştiriniz ve giriş düğmesine basınız...");
				int yatırım = scanner.nextInt();
				scanner.nextLine();
				bakiye = bakiye + yatırım;
				System.out.print("Yeni bakiye:"+ bakiye);
		
		}
		
		}
		
	}

}
