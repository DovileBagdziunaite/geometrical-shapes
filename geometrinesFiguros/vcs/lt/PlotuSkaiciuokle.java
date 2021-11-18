package geometrinesFiguros.vcs.lt;

public class PlotuSkaiciuokle {

	public static void main(String[] args) {
		
		IvestisIsvestis ivIsv = new IvestisIsvestis();
		
		ivIsv.suzinokFigura();

		if(ivIsv.getPasirinkimas() == 1) {
			Kvadratas kvadr = new Kvadratas(ivIsv.getKrastine1());
			kvadr.skaiciuokPlota();
			ivIsv.spausdinkPlota(kvadr.toString());
		} 
		
		if (ivIsv.getPasirinkimas() == 2){
			Trikampis trik = new Trikampis (ivIsv.getKrastine1(), ivIsv.getKrastine2());
			trik.skaiciuokPlota();
			ivIsv.spausdinkPlota(trik.toString());
		}
		
		if(ivIsv.getPasirinkimas() == 3) {
			Skritulys skrit = new Skritulys(ivIsv.getKrastine1());
			skrit.skaiciuokPlota();
			ivIsv.spausdinkPlota(skrit.toString());
		}		
	}
}