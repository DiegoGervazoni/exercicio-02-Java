import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double area;
		double pi = 3.14159;
		double raio = sc.nextDouble();

		area = pi * Math.pow(raio, raio);

		System.out.printf("Valor da área = %.4f%n", area);

		sc.close();

	}

}
