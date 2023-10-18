package javahaftakilders;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		Scanner tarascanner=new Scanner(System.in);
		//Scanner tarascannerboy=new Scanner(System.in);
		System.out.print("lutfen kilonuzu ve boyunuzu m cinsinden girin: ");
		float kilo=tarascanner.nextFloat();
		float boy=tarascanner.nextFloat();
		float a=boy*boy;
		float hesaplama=(kilo/a);
		
		System.out.println("vucut kutle endeksi: "+hesaplama);
		
		if(hesaplama<=18.5f)
			System.out.println("zayifsiniz");
		else if(hesaplama>=18.5f && hesaplama<=29.9f)
			System.out.println("normalsiniz");
		else if(hesaplama>=24.9 && hesaplama<=29.9)
			System.out.println("sismansiniz");
		else
			System.out.println("obezsiniz");
		
		
		
	}

}
