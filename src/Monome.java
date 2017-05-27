
public class Monome implements Comparable {
	private int puissance;
	private double coef;
	
	Monome(int pdegre, double pnumber) {
		puissance = pdegre;
		coef = pnumber;
		System.out.println("Creating new monome : " + coef + " * X^" + puissance);
	}

	public int getPuissance() {
		return puissance;
	}

	public double getCoef() {
		return coef;
	}
	
	public void add(Monome to_add) {
		this.coef =  coef + to_add.getCoef();
	}

	@Override
	public int compareTo(Object o) {
		Monome m;
		if (o instanceof Monome) {
			m = (Monome) o;
			if (m.getPuissance() > puissance)
				return (1);
			else if (m.getPuissance() < puissance)
				return (-1);
			else
				return (0);
		}
		else
			return 0;
	}
	
	public String toString() {
		if (puissance != 0)
			return (coef + " * X^" + puissance);
		else
			return (String.valueOf(coef));
	}
}
