package execução;

//import java.util.Scanner;

import classes.item;
import classes.itens;

public class executaSistema {
	public static void main(String[] args) {
		itens i = new itens();
		// erro no código quando ele está muito grande. Como resolver?
		// Testando listagem da Classe itens:
		
		i.cadastrar(new item("Corolla 2023", 20992982));
		i.cadastrar(new item("Corolla 2021", 20992980));
		i.cadastrar(new item("Civic 2023", 1239));
		i.cadastrar(new item("Nivus 2023", 8833));
		i.cadastrar(new item("Hilux 2023", 9923));
		i.cadastrar(new item("i30   2023", 99233));
		i.adicionar(1239, 2);
		i.adicionar(20992982, 1);
		i.adicionar(8833, 2);
		i.adicionar(9923, 1);
		i.adicionar(99233, 1);
		i.listar();
		// Testando o cadastro de itens na lista através do Scanner:
//		Scanner t = new Scanner(System.in);
//		System.out.println("Digite o nome do carro e o seu ano ao lado: ");
//		String nomedoCarro = t.nextLine();
//		System.out.println("Digite o código do carro: ");
//		
//		long codigoCarro = Long.parseLong(nomedoCarro);
	}
}
