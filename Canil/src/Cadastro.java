import java.util.Scanner;

public class Cadastro {
	
	public String nome;
	public String raca;
	public int idade=-1;
	public char sexo;
	public char pedigree;
	public char prem;
	char op;
	
	Scanner tc = new Scanner(System.in);
	
	
	
	public Cadastro (String nome){
		while(nome.length()<2){
			System.out.println("Nome invalido");
			System.out.println("Informe um nome");
			this.nome=tc.next();
		}
	}
	
	
	
	public void ler(String n){
	    this.nome=n;
		while(this.idade <0){
		System.out.println("Digite idade");
		this.idade =tc.nextInt();
		}
		
		
		System.out.println("Digite raça");
		this.raca =tc.next();
		
		while((this.sexo)!='f' && (this.sexo)!='m'){
			System.out.println("Sexo?");
			this.sexo=tc.next().charAt(0);
		}
		
		
		while(this.pedigree !='s'&& this.pedigree !='n'){
			System.out.println("tem pedigree?");
			this.pedigree=tc.next().charAt(0);
		}
		
		
		
		while(this.prem != 's' && this.prem != 'n'){
		System.out.println("tem premiacoes?");
		
		this.prem =tc.next().charAt(0);
		}
	

}
	
	public boolean comparaNome(String nome){
		if(nome.length()<4){
			System.out.println("Numero de caracteres insuficiente");
			return false;
		}else{
		if(nome.substring(0,4).equals(this.nome.substring(0, 4)))
				
		return true;
		
		else return false;
		}
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Cadastro [nome=" + nome + ", raca=" + raca + ", idade=" + idade + ", sexo=" + sexo + ", pedigree=" + pedigree
				+ ", premiacao=" + prem + "]";
	}
}
