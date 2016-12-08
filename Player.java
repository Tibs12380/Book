//Player.java
/*
 *
 *Author Darren Marsh T0018981 
 */
 
public class Player extends Person{
	private String characterClass;
	private String race;
	private String gender;
	
	/** Player
	 *Creates a new player based on default values. called when the user enters no values there there charcter
	 */
	public Player(){
		this.characterClass = "Trickster";
		this.race ="Human";
		this.gender = "Male"; 
	}
	
	
	/** Player
	 *Creates a new player using the vaules enterd by the user
	 *@param characterClass The class the user has shosen for there character
	 *@param race The species the character is, chosen by the user
	 *@param gender whether the character is male or female
	 *@param name the name of the character
	 *@param hairColor the color of the characters hair
	 *@param age the age of the character.
	 */
	public Player(String characterClass, String race, String gender, String name, String hairColor, int age){
		this.characterClass = characterClass;
		this.race = race;
		this.gender =gender;
		setName(name);
		setHairColor(hairColor);
		setAge(age);
	}
	
	public void setCharacterClass(String characterClass){
		this.characterClass=characterClass;
	}	
	
	public void setRace(String race){
		this.race=race;
	}
	
	public void setGender(String gender){
		this.gender=gender; 
	}
	
	public String getCharacterClass(){
		return characterClass;
	} 
	
	public String getRace(){
		return race;
	}	
	
	public String getGender(){
		return gender;
	}	
}