
public class Complex {
	private double i;
	private double r;
	
	Complex(double pi, double pr) {
		i = pi;
		r = pr;
	}
	
	public void print() {
		System.out.println(r + " + i * " + i);
	}
}
