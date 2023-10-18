package javahaftakilders;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		Scanner taraScanner=new Scanner(System.in);
		
		final double Pi=3.14159d;
		
		System.out.print("lutfen yaricapi girin: ");
		int yaricap=taraScanner.nextInt();
		
		double cevre=(double)(2*Pi*yaricap);
		System.out.println("cevre: "+cevre);
		
		double alan=(double)(Pi*yaricap*yaricap);
		System.out.println("alan: "+alan);
		
	}

}
