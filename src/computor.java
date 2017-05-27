 public class computor {
	 

	public static void main(String[] args) {
		Polynome pol;
		Pol_deg_2 pol2;
		
		if (args.length != 1) {
			System.out.println("Wrong number of arguments :( ");
			return ;
		}
		
		System.out.println("Argument : [" + args[0] + "]");
		try {
			pol = new Polynome(args[0]);
		} catch (Exception e) {
			System.out.println("Une erreur est survenue lors du parsing. Veuillez vérifier le bon format de l'expression entrée. "
					+ "Détails de l'erreur : " + e.toString() + ".");
			e.printStackTrace();
			System.out.println("Computor-V1 va à présent se terminer.");
			return ;
		}
		pol.sort();
		System.out.println("pol : " + pol);
		System.out.println("Polynomial degree: " + Integer.toString(pol.getDegre()));
		if (pol.getDegre() > 2)
		{
			System.out.println("The polynomial degree is stricly greater than 2, I can't solve.");
		}
		if (pol.getDegre() == 2) {
			pol2 = new Pol_deg_2(pol);
			System.out.println("Delta : " + pol2.getDelta());
		}
	}
}
