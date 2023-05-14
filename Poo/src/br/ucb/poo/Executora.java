package br.ucb.poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Executora {
	public static void main(String[] args) {

		ArrayList<Movel> moveis = new ArrayList<Movel>();
		ArrayList<Casa> casas =  new ArrayList<Casa>();
		
		Scanner ler = new Scanner (System.in);
		
		// C R U D
		
		// Creat sem Scan
			Movel movelNovo = new Movel();
			
			movelNovo.setId(1);
			movelNovo.setTitle("cadeira");
			movelNovo.setPrice(300);
			movelNovo.setPhoto("cadeira.png");
			movelNovo.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor");
			movelNovo.setCategory("Banheiro");
			
			moveis.add(movelNovo);
		
		// Creat com scan 
		
			Casa casa = new Casa();
			
			System.out.print("Informe o ID: ");
			casa.setId(ler.nextInt());
			
	       	System.out.print("Informe o Titulo: ");
	       	casa.setTitle(ler.next());
	        
	        System.out.print("Informe o Preço: ");
	        casa.setPrice(ler.nextInt());

	        System.out.print("Adicione a foto ->  ");
	        casa.setPhoto(ler.nextLine());
	        
	        System.out.print("Informe a descrição: ");
	        casa.setDescription(ler.nextLine());
	        
	        System.out.print("Informe a quantitade de quartos: ");
	        casa.setManyBedroom(ler.nextInt());
	        
	        System.out.print("Informe a quantitade de suites: ");
	        casa.setManySuites(ler.nextInt());
	        
	        System.out.print("Informe a quantitade de banheiro: ");
	        casa.setManyBathrooms(ler.nextInt());
	        
	        System.out.print("Informe se a garagem: ");
	        casa.setManyGarage(ler.nextBoolean());
	        
	        
	        
	        
	        casas.add(casa);
	        
		// Read
	        
	        System.out.println("\n==================== MOVEIS =========================\n");
	        
	        for (int i = 0; i < moveis.size(); i++) {
				System.out.println("ID: " + moveis.get(i).getId());
				System.out.println("Titulo: " + moveis.get(i).getTitle());
				System.out.println("Preço: " + moveis.get(i).getPrice());
				System.out.println("Foto: " + moveis.get(i).getPhoto());
				System.out.println("Descrição: " + moveis.get(i).getDescription());
				System.out.println("Categoria: " + moveis.get(i).getCategory());
				if(i + 1 < moveis.size()) {
					System.out.println("\n=============================================\n");
				}
			}
			
	        System.out.println("\n==================== CASAS =========================\n");
	        
			for (int i = 0; i < casas.size(); i++) {
				System.out.println("ID: " + casas.get(i).getId());
				System.out.println("Titulo: " + casas.get(i).getTitle());
				System.out.println("Preço: " + casas.get(i).getPrice());
				System.out.println("Foto: " + casas.get(i).getPhoto());
				System.out.println("Descrição: " + casas.get(i).getDescription());
				System.out.println("Quartos: " + casas.get(i).getManyBedroom());
				System.out.println("Suites: " + casas.get(i).getManySuites());
				System.out.println("Banheiros: " + casas.get(i).getManyBathrooms());
				System.out.println("Garagem: " + casas.get(i).getMavyGarage());
				if(i + 1 < casas.size()) {
					System.out.println("\n=============================================\n");
				}
			}
		
		// upDate
		
			System.out.println("\n=================== UPDATE ==========================\n");
			
			Casa casaAtualizada = new Casa();
			
			
			System.out.print("Informe o ID: ");
			casaAtualizada.setId(ler.nextInt());
			
	       	System.out.print("Informe o Titulo: ");
	       	casaAtualizada.setTitle(ler.next());
	        
	        System.out.print("Informe o Preço: ");
	        casaAtualizada.setPrice(ler.nextInt());
	        
	        System.out.print("Adicione a foto ->  ");
	        casaAtualizada.setPhoto(ler.nextLine());
	        
	        System.out.print("Informe a descrição: ");
	        casaAtualizada.setDescription(ler.nextLine());
	        
	        System.out.print("Informe a quantitade de quartos: ");
	        casaAtualizada.setManyBedroom(ler.nextInt());
	        
	        System.out.print("Informe a quantitade de suites: ");
	        casaAtualizada.setManySuites(ler.nextInt());
	        
	        System.out.print("Informe a quantitade de banheiro: ");
	        casaAtualizada.setManyBathrooms(ler.nextInt());
	        
	        System.out.print("Informe se a garagem: ");
	        casaAtualizada.setManyGarage(ler.nextBoolean());
	        
	        
	        casa = casaAtualizada;
	        
			casas.set(0, casa);
			
			System.out.println("\n=============================================\n");
			
			for (int i = 0; i < casas.size(); i++) {
				System.out.println("ID: " + casas.get(i).getId());
				System.out.println("Titulo: " + casas.get(i).getTitle());
				System.out.println("Preço: " + casas.get(i).getPrice());
				System.out.println("Foto: " + casas.get(i).getPhoto());
				System.out.println("Descrição: " + casas.get(i).getDescription());
				System.out.println("Quartos: " + casas.get(i).getManyBedroom());
				System.out.println("Suites: " + casas.get(i).getManySuites());
				System.out.println("Banheiros: " + casas.get(i).getManyBathrooms());
				System.out.println("Garagem: " + casas.get(i).getMavyGarage());
				if(i + 1 < casas.size()) {
					System.out.println("\n=============================================\n");
				}
			}
			
		// Delete
			
			casas.remove(0);
			
			System.out.println("\n=================== DELETE ==========================\n");
			
			if(casas.size() > 0) {
				for (int i = 0; i < casas.size(); i++) {
					System.out.println("ID: " + casas.get(i).getId());
					System.out.println("Titulo: " + casas.get(i).getTitle());
					System.out.println("Preço: " + casas.get(i).getPrice());
					System.out.println("Foto: " + casas.get(i).getPhoto());
					System.out.println("Descrição: " + casas.get(i).getDescription());
					System.out.println("Quartos: " + casas.get(i).getManyBedroom());
					System.out.println("Suites: " + casas.get(i).getManySuites());
					System.out.println("Banheiros: " + casas.get(i).getManyBathrooms());
					System.out.println("Garagem: " + casas.get(i).getMavyGarage());
					if(i + 1 < casas.size()) {
						System.out.println("\n=============================================\n");
					}
				}
			}else {
				System.out.println("Nenhuma casa encontrada");
			}
			
			ler.close();
		
		}

	}

