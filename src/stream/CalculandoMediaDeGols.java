package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CalculandoMediaDeGols {

	public static void main(String[] args) {

		System.out.println("--- MEDIA DE GOLS ---");
		System.out.println();

		String nome;
		List<Integer> golsPorPartida;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nome do Jogador: ");
			nome = sc.next();

			String incluirGols;
			System.out.println("Gostaria de adicionar gols a esse jogador ? (s/n)");
			incluirGols = sc.next();

			int partida = 1;
			golsPorPartida = new ArrayList<>();
			while ("s".equalsIgnoreCase(incluirGols)) {
				System.out.printf("Quantos gols %s fez na partida %d: ", nome, partida);
				int golsNaPartida = sc.nextInt();
				golsPorPartida.add(golsNaPartida);

				partida++;

				System.out.println("Deseja continuar (s/n) ?");
				incluirGols = sc.next();
			}
		}
		imprimirMediaDeGols(nome, golsPorPartida);
	}

//	private static void imprimirMediaDeGols(String nome, List<Integer> golsPorPartida) {
//		double totalGols = 0;
//		for (Integer golsNaPartida : golsPorPartida) {
//			totalGols += golsNaPartida;
//		}
//		double media = 0;
//		if(!golsPorPartida.isEmpty()) {
//			media = totalGols / golsPorPartida.size();			
//		}
//	    System.out.printf("\nO %s fez uma média de %.2f gols por jogo", nome, media);
//	}

	// METODO imprimirMediaDeGols com API Stream
	private static void imprimirMediaDeGols(String nome, List<Integer> golsPorPartida) {
//		Stream<Integer> stream = golsPorPartida.stream();
//		DoubleStream doubleStream = stream.mapToDouble(Integer::doubleValue);
//		OptionalDouble optionalDouble = doubleStream.average();
//		double media = optionalDouble.orElse(0.0);

		// TODOS OS CODIGOS ACIMA EM APENAS UMA LINHA
		double media = golsPorPartida.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

		System.out.printf("\nO %s fez uma média de %.2f gols por jogo", nome, media);

	}
}
