//Person.java
/*
 *
 */
 
 public class Person{
 	private String name;
 	private String hairColor;
 	private int age;
 	
 	public Person(){
 		this.name = "Unknown";
 		this.hairColor = "Grey";
 		this.age = 33;
 	}
 	public Person(String name, String hairColor, int age){
 		this.name=name;
 		this.hairColor=hairColor;
 		this.age=age;
 	}
 	
 	
 	public void setName(String name){

		this.name = name;
 	}
 
 	public void setHairColor(String hairColor){

		this.hairColor = hairColor;
 	}
 	
 	public void setAge(int age){

		this.age=age;
 	}
 	 	
 	/** getName
 	 * returns the name  of the character.
 	 *@return The name of the character the method was called on
 	 */
 	public String getName(){
 		return name;
 	}
 	
 	public String gethairColor(){
 		return hairColor;
 	}
 	
 	public int getAge(){
 		return age;
 	}
 }