package javahaftakilders;

import java.util.Scanner;

public class soru1b {

	public static void main(String[] args) {
		Scanner taraScanner=new Scanner(System.in);
		
		System.out.print("lutfen 5 basamakli bir sayi girin: ");
		int num=taraScanner.nextInt();
		int basamak=0;
		
		
		while(true) {
			
			basamak=num%10;
			
			
			num/=10;
			
			
			
			if(basamak!=0)
				System.out.print(basamak+" ");
			
			if(basamak==0 || basamak<0)
				break;
		}
	}

}
