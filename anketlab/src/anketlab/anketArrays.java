package anketlab;

import java.util.Scanner;
import java.util.Arrays;

public class anketArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kontrol = 1;
		int kisiSayisi=0;
		int a=0,b=0,c=0,d=0,e=0;
		
		
		
		int [][] cevaplar = new int [5][10];
		
		
		while(kontrol == 1) {
			
			kisiSayisi++;
			int puan=0;
			
			System.out.println("Konularin Önemine Göre 1-10 Arasi Deger Giriniz.");
			
			System.out.println("Soru 1\n- Ekonominin Önemi: ");
			a=input.nextInt();
			cevaplar[0][a-1]++;
			
			System.out.println("Soru 2\n- Kuresel Isınmanın Önemi: ");
			b=input.nextInt();
			cevaplar[1][b-1]++;
			
			System.out.println("Soru 3\n- Hayvan Haklarının Önemi: ");
			c=input.nextInt();
			cevaplar[2][c-1]++;
			
			System.out.println("Soru 4\n- Siyasi Sorunların Önemi: ");
			d=input.nextInt();
			cevaplar[3][d-1]++;
			System.out.println("Soru 5\n- Secimlerin Önemi: ");
			e=input.nextInt();
			cevaplar[4][e-1]++;
			
			
			System.out.println("Teste girmek icin 1, testten cikmak icin 2'ye basiniz.");
			kontrol = input.nextInt();
			
			
			for(int i=0 ; i<5 ; i++) {
				for(int j=0 ; j<10 ; j++)
				{
					System.out.print(cevaplar[i][j]+" ");
				}
				System.out.println("\n ");
			}
			System.out.println("");
			
		}
		
		double [] toplam = new double [5];
		
		for(int m=0 ; m<5 ; m++) {
			for(int n=0 ; n<10 ; n++) {
				toplam[m]+=(n+1)*cevaplar[m][n];
			
			}
		}
	for (double sayilar: toplam) {
		double ortalama = sayilar/kisiSayisi;
		System.out.println(ortalama);
	}
	
	
	
	
		
		
		
		
				
		

	}

	}


