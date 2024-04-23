import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		char escala;
		double celsius, fahrenheit = 0;

		System.out.print("Você vai digitar a temperatura em C ou F?");
		escala = scanner.next().charAt(0);

		if (escala == 'F') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = scanner.nextDouble();

			celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
			System.out.printf("Temperatura equivalente em Celsius: %.2f\n", celsius);

		} else {
			System.out.print("Digite a temperatura em Celsius: ");
			celsius = scanner.nextDouble();

			fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", fahrenheit);
		}
		scanner.close();
	}

}
