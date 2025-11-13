import java.util.Scanner;

public class AtividadeAnimal{
public static void main (String[] args){

	Scanner myObj = new Scanner(System.in);
	String raca = myObj.nextLine();
	String nome = myObj.nextLine();
	int idade = myObj.nextInt();
	
	Animal cachorro = new Animal();

	cachorro.raca = raca;
	cachorro.idade = idade;
	cachorro.nome = nome;
	
	cachorro.barulho();
 }
}


class Animal {
	String raca;
	int idade;
	String nome;
	Boolean emExtincao;
	
	void barulho(){
	System.out.println("Grunido animal");
	 
 }
}

