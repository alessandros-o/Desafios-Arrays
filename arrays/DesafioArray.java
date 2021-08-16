package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja lançar?");
		int tamanhoArray = entrada.nextInt();
		double[] notasAluno = new double[tamanhoArray];
		
		for(int i = 0; i < notasAluno.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double soma = 0;
		for(double nota: notasAluno) {
			soma += nota;
		}
		System.out.println("A média do aluno é: " + soma / notasAluno.length);
		
		entrada.close();
	}

}
