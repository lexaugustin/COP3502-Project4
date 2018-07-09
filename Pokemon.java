//Name: Alexander Augustin 
//2196 - 9085 
//Section: 165B
//Project Number: 4
//Brief description of file contents: Project 4


// This class defines what constitutes an object of type Pokemon.

public class Pokemon {
	String species;
	int attack;
	int defense;
	int speed;


	// Constructor
	public Pokemon (String species){
		this.species = species;
		attack = (species.length() * 4) + 2;
		defense = (species.length() * 2) + 7;
		speed = (species.length() * 3) + 5;	
	}

	// this method increases attack based on the given boost
	public void grow(int boost){
		attack += boost;
	}

	// This method increases defense based on the given boost
	public void harden(int boost){
		defense += boost;
	}

	// This method increases speed based on the given boost
	public void haste(int boost){
		speed += boost;
	}

	// Getters and Setters
	public void setSpecies(String spc){
		species = spc;
	}
	public String getSpecies(){
		return species;
	}


	public void setAttack(int atk){
		attack = atk;
	}
	public int getAttack(){
		return attack;
	}


	public void setDefense(int def){
		defense = def;
	}
	public int getDefense(){
		return defense;
	}

	public void setSpeed(int spd){
		speed = spd;
	}
	public int getSpeed(){
		return speed;
	}




}