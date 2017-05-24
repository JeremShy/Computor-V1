
public class Monome {
	private int degre;
	private double number;
	
	Monome(int pdegre, double pnumber) {
		degre = pdegre;
		number = pnumber;
	}

	public int getDegre() {
		return degre;
	}

	public double getNumber() {
		return number;
	}
	
	public Monome add_monome(Monome to_add) {
		Monome ret = new Monome(degre, number + to_add.getNumber());
		return (ret);
	}
}
