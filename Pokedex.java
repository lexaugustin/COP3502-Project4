//Name: Alexander Augustin 
//2196 - 9085 
//Section: 165B
//Project Number: 4
//Brief description of file contents: Project 4


// This class defines what constitutes an object of type Pokedex.
public class Pokedex {

	Pokemon [] array;
	public int size;
	int [] checkStats;
	String [] pokemonNames;
	int numberOfPokemon = 0;


	public Pokedex(){	

	}


	public Pokedex(int size){
		array = new Pokemon[size];

	}

	// This method returns an array of Strings containing the names of every Pokemon stored in the Pokedex.

	public String [] listPokemon(){

		pokemonNames = new String [numberOfPokemon];

		for (int i = 0; i < numberOfPokemon; i++){
			pokemonNames [i] = array[i].species;
		}

		if (numberOfPokemon == 0){
			return null;
		}
		else return pokemonNames;

	}  


	/*	This method takes a String parameter called species and stores it in the Pokedex. It does this by adding it to the next free index 
	in the Pokedex’s Pokemon[] array. */

	public boolean addPokemon(String species){

		if (numberOfPokemon >= array.length){
			System.out.println("Max");
			return false;
		}

		for (int i = 0; i < numberOfPokemon; i++){
			if (array[i].getSpecies().equalsIgnoreCase(species)){
				System.out.println("Duplicate");
				return false;
			}
		}

		array[numberOfPokemon]  = new Pokemon(species);
		numberOfPokemon++;


		return true;

	}

	/* This method returns an array of 3 integers containing the attack, defense, and speed of the pokemon specified by a  species string argument, 
		in that order. */


	public int[] checkStats(String species){

		int[] statsArray = null;

		for (int i = 0; i < numberOfPokemon; i++){

			if (array[i].species.compareToIgnoreCase(species) == 0){

				statsArray = new int [3];
				statsArray[0] = array[i].getAttack();
				statsArray[1] = array[i].getDefense();
				statsArray[2] = array[i].getSpeed();  
			}
		}
		return statsArray;
	}  

	/* This method implements a simple Selection Sort. It will sort the elements in the Pokedex’s Pokemon array alphabetically based on 
		the Pokemon’s species names. */

	public void sortPokemon(){
		
		for (int i = 0; i < numberOfPokemon - 1; i++){
			int currentMinIndex = i;
			
			for (int j = i + 1; j < numberOfPokemon; j++){
				if (array[j].species.compareToIgnoreCase(array[currentMinIndex].species) < 0){
					currentMinIndex = j;
				}	
			}
			if (currentMinIndex != i){

			Pokemon temp = array[i];
			array[i] = array[currentMinIndex];
			array[currentMinIndex] = temp;
			}  
		
		}
	}

}

