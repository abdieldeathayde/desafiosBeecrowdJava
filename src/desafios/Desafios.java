package desafios;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafios {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		double Y = sc.nextDouble();
		double valorKmPorLitro = 0.0;
		
		valorKmPorLitro = X / Y;
		
		DecimalFormat df = new DecimalFormat("#.000");
		
		System.out.println(df.format(valorKmPorLitro) + " km/l");
		
		sc.close();
	}

}
