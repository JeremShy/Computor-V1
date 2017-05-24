import java.util.ArrayList;

public class Polynome {
	private ArrayList<Monome> pol;

	Polynome() {
		pol = new ArrayList<Monome>();
	}

	public void add_monome(Monome to_add) {
		Monome	i;
		int		n;
		
		n = 0;
		while (n < pol.size()) {
			i = pol.get(n);
			if (i.getDegre() == to_add.getDegre()) {
				i.add_monome(to_add);
				return ;
			}
			n++;
		}
		pol.add(to_add);
	}
}
