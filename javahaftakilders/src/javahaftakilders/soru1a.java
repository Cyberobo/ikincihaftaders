package javahaftakilders;

import java.util.Scanner;

public class soru1a {

	public static void main(String[] args) {
		Scanner tara=new Scanner(System.in);
		System.out.println("first number: ");
		int num1=tara.nextInt();
		
		System.out.println("second number: ");
		int num2=tara.nextInt();
		
		
		
		System.out.println("toplam: "+(num1+num2));
		System.out.println("cikarma: "+(num1-num2));
		System.out.println("carpma: "+(num1*num2));
		System.out.println("bolme: "+(num1/num2));
	}

}
