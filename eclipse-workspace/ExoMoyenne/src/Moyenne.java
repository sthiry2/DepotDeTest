import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traduction du pseudo code en code Java
		
		//DECLARATIONS DES VARIABLES
		
		//R�el nombre1
		float nombre1;
		//R�el nombre2
		float nombre2;
		//R�el moyenne
		float moyenne;
		
		//SAISIES
		//ecrire "Donnez moi svp le premier nombre:"
		System.out.println("Donnez moi svp le premier nombre:");
		//lire nombre1
		Scanner sc = new Scanner(System.in); //creer un outil scanner
		nombre1 = sc.nextFloat();
		//System.out.println("Vous avez saisie nombre1="+nombre1);
		
		//ecrire "Donnez moi svp lz deuxi�me nombre:"
		System.out.println("Donnez moi svp le deuxi�me nombre:");
		//lire nombre2
		nombre2 = sc.nextFloat();
		//System.out.println("Vous avez saisie nombre2="+nombre2);
		
		
		//TRAITEMENT
		//moyenne <-- (nombre1+nombre2)/2
		moyenne = (nombre1+nombre2)/2;
		

		//AFFICHAGE
		//ecrire "la valeur moyenne est :",moyenne
		System.out.println("la moyenne des 2 nombres est ="+moyenne);

		
		
		
	}

}
