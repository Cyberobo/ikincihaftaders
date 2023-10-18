package javaikicnihaftaders;

import java.util.Scanner;


public class soru1 {

	public static void main(String[] args) {
		Scanner tara=new Scanner(System.in);
		
		System.out.print("lutfen bir deger girin: ");
		int num=tara.nextInt();
		tekCiftBul(num);
		
	}
	
	public static void tekCiftBul(int num) {
		if(num%2==0)
			System.out.println("cift");
		else
			System.out.println("tek");
		
	}
	
}

