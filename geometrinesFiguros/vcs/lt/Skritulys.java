package geometrinesFiguros.vcs.lt;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Skritulys extends Figura {

	public Skritulys(double kr1) {
		super(kr1, kr1);
	}
	
	@Override
	public void skaiciuokPlota() {
		super.skaiciuokPlota();
		//S = PI * r^2
		double skritulioPlotas = super.getPlotas() * Math.PI;
		BigDecimal bigDec = new BigDecimal(skritulioPlotas);
		bigDec = bigDec.setScale(2, RoundingMode.UP);
		super.setPlotas(bigDec.doubleValue());
	}
}