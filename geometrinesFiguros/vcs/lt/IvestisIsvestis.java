package geometrinesFiguros.vcs.lt;

import java.util.Scanner;

public class IvestisIsvestis {
	
	private double ivestasPasirinkimas;
	private double krastine1;
	private double krastine2;
	
	public double getPasirinkimas() {
		return ivestasPasirinkimas;
	}
	
	public double getKrastine1() {
		return krastine1;
	}
	
	public double getKrastine2() {
		return krastine2;
	}
	
	public void suzinokFigura() {
		Scanner scanner = new Scanner(System.in);
		boolean arTeisingasSkaicius;
		int ivestas = 0;
		do {
			System.out.println("Kokios figuros plota norite skaiciuoti?");
			System.out.println("Jei norite skaiciuoti kvadrato plota, spauskite: 1");
			System.out.println("Jei norite skaiciuoti trikampio plota, spauskite: 2");
			System.out.println("Jei norite skaiciuoti skritulio plota, spauskite: 3");
			ivestas = scanner.nextInt();
			System.out.println("Ivestas pasirinkimas yra: " + ivestas);
			if (ivestas == 1) {
				arTeisingasSkaicius = true;
				System.out.println("Iveskite kvadrato vienos krastines ilgi, centimetrais.");
				this.krastine1 = scanner.nextDouble(); 
				System.out.println("Ivestas kvadrato krastine1 ilgis yra: " + krastine1);
				} else if (ivestas == 2) {
					arTeisingasSkaicius = true;
					System.out.println("Iveskite trikampio pirmos statines ilgi, centimetrais.");
					this.krastine1 = scanner.nextDouble();
					System.out.println("Ivestas trikampio statines krastine1 ilgis yra: " + krastine1);
					System.out.println("Iveskite trikampio antros statines ilgi, centimetrais.");
					this.krastine2 = scanner.nextDouble();
					System.out.println("Ivestas trikampio statines krastine2 ilgis yra: " + krastine2);
				}  else if (ivestas == 3) {
					arTeisingasSkaicius = true;
					System.out.println("Iveskite skritulio spindulio ilgi, centimetrais.");
					this.krastine1 = scanner.nextDouble();
					System.out.println("Ivesta skritulio krastine1 ilgis yra: " + krastine1);
				} else {
					arTeisingasSkaicius = false;
					System.out.println("Tokios figuros ploto apskaiciuoti nemoku :) ");
				}
		} while (!arTeisingasSkaicius);
		  this.ivestasPasirinkimas = ivestas;	
	}
	
	public void spausdinkPlota(String str) {
		System.out.println(str);
	}
}