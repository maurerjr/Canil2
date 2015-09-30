import java.util.Scanner;

public class CompararString {
	
	public void ler(){
	
	Scanner tc = new Scanner(System.in);
		
	System.out.println("Digite primeira palavra: ");
	    String nome = tc.next();
	    System.out.println("Digite segunda palavra");
	    String nome2 =tc.next();
	   
	    
	    
	    String A = nome.substring(0,5);
	    String B = nome2.substring(0,5);
	    
	    boolean c = A.equals(B);{
	    	if(c == true)
	    		System.out.println(A +" eh igual");
	    	else
	    		System.out.println("Negativo");
	    }
        }
}

