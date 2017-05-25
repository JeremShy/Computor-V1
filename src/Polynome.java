import java.util.ArrayList;

public class Polynome {

	private ArrayList<Monome> pol;

	Polynome() {
		pol = new ArrayList<Monome>();
	}

	Polynome (String arg) throws Exception {
		this();
		
		int 	signe;
		double	coefficient;
		int		puissance;
		int		i;
		int		len;

		i = 0;
			while (i < arg.length()) {
				System.out.println("[" + arg.substring(i) + "]");
				if (arg.charAt(i) == '-')
				{
					signe = -1;
					i++;
				}
				else
					signe = 1;
				len = 0;
				while (Character.isDigit(arg.charAt(i + len)) || arg.charAt(i + len) == '.') {
					len++;
				}
				coefficient = Double.parseDouble(arg.substring(i, i + len)) * signe;
				System.out.println("Coefficient: " + coefficient);
				i += len;
				i += 5;
				if (i > arg.length() || 1 == 1) {
					throw new ParseException("Unexpected end");
				}
			}
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
