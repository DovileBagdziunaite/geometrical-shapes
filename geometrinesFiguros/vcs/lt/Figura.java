package geometrinesFiguros.vcs.lt;

public class Figura {
	
	private double plotas;
	private double krastine1;
	private double krastine2;

	public Figura(double kr1, double kr2) {
		this.krastine1 = kr1;
		this.krastine2 = kr2;
	}

	public double getPlotas() {
		return plotas;
	}

	public void setPlotas(double plotas) {
		this.plotas = plotas;
	}
			
	public void skaiciuokPlota() {
		this.plotas = krastine1 * krastine2;
	}

	@Override
	public String toString() {
		return "Jusu figuros plotas yra: " + plotas + " " + " kv.cm";
	}
}