 public class computor {
	 

	public static void main(String[] args) {
		Polynome pol;
		
		if (args.length != 1) {
			System.out.println("Wrong number of arguments :( ");
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
		System.out.println(pol);
		//		arg = args[0];
//		System.out.println("Parsing arg : [" + arg + "]");
//		i = 0;
//		while(arg.charAt(i) == ' ')
//			i++;
//		if (arg.charAt(i) == '-') {
//			signe = -1;
//			i++;
//		}
//		else
//			signe = 1;
//		len = 0;
//		while (Character.isDigit(arg.charAt(i + len)) || arg.charAt(i + len) == '.') {
//			len++;
//		}
//		coef = Double.parseDouble(arg.substring(i, i + len)) * signe;
//		System.out.println("Coef : " + coef);
//		i = i + len;
//		i = arg.indexOf('X', i);
//		while(arg.charAt(i) == ' ')
//			i++;
//		if (arg.charAt(i) == '-') {
//			signe = -1;
//			i++;
//		}
//		else
//			signe = 1;
	}
}
