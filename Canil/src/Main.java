import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		ArrayList<Cadastro> caes = new ArrayList<>();
		
		

	    int op;
	    int op2;
		
		
		
		
		do{
			
			System.out.println("Menu: \n 1 Comparar String \n 2 Canil \n 3 sair");
			 op = tc.nextInt();
			switch(op){
			
			
			//                   Case 1 é Exercicio 1
			case 1: {
				
				CompararString c = new CompararString();
				c.ler();
				
				
				break;
			}
			
			
			
			
			// AQUI NO CASE 2 COMEÇA EXERCICIO 2
			case 2: {
				
				do{
					System.out.println("1 Cadastrar: \n 2 Remover\n 3 Listar\n 4 Excluir por nome semelhante\n 5 Excluir por nome igual\n 6 Excluir por pedigree\n 7 Listar por pedigree\n 8 Listar por raça\n 9 Listar por Nome Semelhante \n 10 sair");
					
					
					

					op2=tc.nextInt();
					
					switch(op2){
					
					case 1:{
							String nome;
							System.out.println("Informe um nome");
							nome=tc.next();
							Cadastro c1 = new Cadastro(nome);
							if(caes.contains(c1)){
								System.out.println("Já tem animal com os mesmo dados");
							}
							else{
								c1.ler(nome);
								caes.add(c1);
							}
						break;
					}
					case 2:{
						String nome;
						System.out.println("Informe um nome:");
						nome=tc.next();
						Cadastro c1 = new Cadastro(nome);
						if(caes.contains(c1)){
							caes.remove(c1);
							System.out.println("Removido com Sucesso!");
						}
						else{
							System.out.println("Nome nao encontrado:");
						}
						break;
					}
					case 3:{
						String nome;
						System.out.println("Informe um nome");
						nome=tc.next();
						Cadastro c1 = new Cadastro(nome);
						int posicao = caes.indexOf(c1);
						if(posicao == -1){
							System.out.println("Nome não encontrado");
						}else{
						System.out.println(caes.get(posicao).toString());
						}
					break;	
					}
					
					case 4:{
						String nome;
						System.out.println("Digite o nome do cachoro");
						nome=tc.next();
						Cadastro c1 = new Cadastro(nome);
						for(int i = 0; i<caes.size(); i++){
							if(c1.comparaNome(caes.get(i).nome)){
							caes.remove(i);
							System.out.println("Nome semelhante removido");
							}
						}
						break;
					}
					case 5:{
						String nome;
						System.out.println("Informe um nome");
						nome=tc.next();
						Cadastro c1 = new Cadastro(nome);
						if(caes.contains(c1)){
							int posicao = caes.indexOf(c1);
							caes.remove(posicao);
							System.out.println("Animal excluido com sucesso ");
						}
						else{
							System.out.println("Nome não encontrado");
						}
						break;
					}
					
					case 6:{
						for(int i=0; i<caes.size(); i++){
							if((caes.get(i).pedigree)==('s')||(caes.get(i).pedigree)==('S')){
								caes.remove(i);
								System.out.println("Removido com sucesso");
							}else{
								System.out.println("Não há cachorro com pedigree cadastrado");
							}
						}
						break;
					}
					case 7:{
						for(int i=0; i<caes.size(); i++){
							if((caes.get(i).pedigree)==('s')||(caes.get(i).pedigree)==('S')){
								System.out.println(caes.get(i).toString());
							}
							else{
								System.out.println("Não existe cachorro com pedigree cadastrados");
							}
						}
						break;
					}
					case 8:{
						String raca;
						System.out.println("Informe uma raca");
						raca=tc.next();
						for(int i=0; i<caes.size(); i++){
							if(caes.get(i).raca.equals(raca)){
								System.out.println(caes.get(i).toString());
							}
							else{
								System.out.println("Raca não encontrada");
							}
						}
					}
					case 9:{
						String nome;
						System.out.println("Informe um nome");
						nome=tc.next();
						Cadastro c1 = new Cadastro(nome);
						for(int i=0; i<caes.size(); i++){
							if(c1.comparaNome(caes.get(i).nome)){
								System.out.println(caes.toString());
							}
							else{
								System.out.println("Nome não encontrado:");
							}
						}
						
						break;
					}
					
					case 10: break;
					
					
					}
				
					
				}while(op!=10);
			}
			
			case 3: break;
			}
			
				
				}while(op!=3);
				
							
		}
				
			
	}
				
	
