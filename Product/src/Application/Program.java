package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		List<Product> list = new  ArrayList<>();
		
		System.out.println("Numero mercadorias");
		int N=input.nextInt();
		
		for(int i=0;i<N;i++) {
			String name;
			double price;
			System.out.println("Type: (c/u/i)");
			char type = input.next().charAt(0);
			
			if(type == 'c') {
				input.nextLine();
				System.out.println("Name: ");
				name = input.nextLine();
				System.out.println("Price: ");
				price = input.nextDouble();
				list.add(new Product(name, price));
			}
			else if(type == 'u') {
				input.nextLine();
				System.out.println("Name: ");
				name = input.nextLine();
				System.out.println("Price: ");
				price = input.nextDouble();
				input.nextLine();
				String manufactureData = input.nextLine();
				list.add(new UsedProduct(name, price, manufactureData));
			}
			else {
				input.nextLine();
				System.out.println("Name: ");
				name = input.nextLine();
				System.out.println("Price: ");
				price = input.nextDouble();
				double customsFree = input.nextDouble();
				list.add(new ImportedProduct(name, price,customsFree));
			}
		}
		
		System.out.println("Prices Tag: ");
		for(Product produto: list){
			System.out.println(produto.PriceTag());
		}
		
		
		
	    input.close();

	}

}
