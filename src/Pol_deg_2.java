
public class Pol_deg_2 extends Polynome{ // a * x2 + bx + c
	private double a;
	private double b;
	private double c;
	
	Pol_deg_2(double pa, double pb, double pc) {
		a = pa;
		b = pb;
		c = pc;
	}
	Pol_deg_2(Polynome pol) {
		a = (pol.get_monome_deg(2)).getCoef();
		b = (pol.get_monome_deg(1)).getCoef();
		c = (pol.get_monome_deg(0)).getCoef();
	}
	
	public double getDelta() {
		return (b * b - 4 * a * c);
	}
}
