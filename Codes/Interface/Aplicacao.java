import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {

		int num;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas formas você deseja criar?");
		int quantidade = entrada.nextInt();

		System.out.println("----------------------------- App -------------------------");
		System.out.println(" Para Quadrado digite 1 \n Para Retangulo digite 2 \n Para Circulo digite 3");
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite o numero:");
			num = entrada.nextInt();

			if (num == 1) {
				Quadrado[] quadrado = new Quadrado[i + 1];
				quadrado[i] = new Quadrado();
				if (quadrado[i] instanceof Quadrado) {
					System.out.println("Digite o tamanho do lado do seu Quadrado:");
					int lado = entrada.nextInt();
					quadrado[i].setLado1(lado);
					quadrado[i].setLado2(lado);
					quadrado[i].setLado3(lado);
					quadrado[i].setLado4(lado);

					// Calcular Perimetro do quadrado.
					quadrado[i].CalcularPerimetro();
					quadrado[i].AreaForma();
					// Imprime o tamanho do lado digitado.
					System.out.println("O tamanho do lado do seu quadrado é: " + quadrado[i].getLado1());
				}
			} else if (num == 2) {
				Retangulo[] retangulos = new Retangulo[quantidade];
				retangulos[i] = new Retangulo();
				if (retangulos[i] instanceof Retangulo) {
					System.out.println("Digite a Altura:");
					int alt = entrada.nextInt();
					retangulos[i].setLado1(alt);
					System.out.println("Digite a base:");
					int base = entrada.nextInt();
					retangulos[i].setLado2(base);

					retangulos[i].CalcularPerimetro();
					retangulos[i].AreaForma();

					System.out.println("A altura digitada é: " + retangulos[i].getLado1());
					System.out.println("A base digitada é: " + retangulos[i].getLado2());

				}
			} else if (num == 3) {
				Circulo[] circulos = new Circulo[quantidade];
				circulos[i] = new Circulo();
				if (circulos[i] instanceof Circulo) {
					System.out.println("Digite o tamanho do raio do seu Circulo:");
					int raio = entrada.nextInt();
					circulos[i].setRaio(raio);

					circulos[i].CalcularPerimetro();
					circulos[i].AreaForma();

					System.out.println("O valor do seu raio é: " + circulos[i].getRaio());
				}
			}
		}

		entrada.close();

	}
}