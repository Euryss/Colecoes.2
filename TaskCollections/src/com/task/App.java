package com.task;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
public class App {

	public static Deque<Dados> listanomes = new ArrayDeque<Dados>();
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		char opcao = '1';
		
		do {
			System.out.println("Opçoes\n");
			System.out.println("Inserir-----[i]");
			System.out.println("Visualizar--[v]\n");
			System.out.print("Op: ");
			opcao = input.nextLine().charAt(0);
			switch(opcao) {
			case 'i':
				System.out.println("Nome: ");
				String nome = input.nextLine();
				System.out.print("\nSexo: ");
				char sexo = input.nextLine().charAt(0);
				inserir(nome,sexo);
				break;
				
			case 's':
				System.out.println("Lista");
				visualizar();
				System.out.println("");
				break;
	
			default:
				System.out.println("Opção inválida, tente novamente.");
				break;
					
			}
				
		}while(opcao != 'n');
		
		System.out.println("Finalizado");
	}
	
	public static void inserir(String nome, char sexo) {
		 if(sexo != 'm' || sexo == 'f') {
			 System.out.println("Insira um genero válido");
		 }else {
			 Dados nomes = new Dados(nome,sexo);
				listanomes.add(nomes);
				System.out.println("Inserido com sucesso");
		 }
	}
	public static void visualizar() {
		System.out.println("****Registros*****");
		for(Dados lista: listanomes) {
			if(lista.getSexo() == 'f') {
				System.out.println("****Mulheres*****");
				System.out.println("--"+lista.getNome());
			}else if(lista.getSexo() == 'm') {
				System.out.println("****Homens*****");
				System.out.println("--"+lista.getNome());	
			}
		}
		
	}

}
