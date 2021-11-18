package geometrinesFiguros.vcs.lt;

public class Trikampis extends Figura {

	public Trikampis(double kr1, double kr2) {
		super(kr1, kr2);
	}
	
	@Override	
	public void skaiciuokPlota() {
		super.skaiciuokPlota();
		double trikampioPlotas = (super.getPlotas()) / 2;
		super.setPlotas(trikampioPlotas);
	}
}