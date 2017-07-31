/**  
* PlayerComparable --- Sort an array/arraylist of Player objects according to their names
* @author Megha Rastogi
*/

import java.util.*;

/**
* Player --- store the players information
*/
class Player implements Comparable<Player>{

	private String name;
	private int age;
	private int weight;
	private int wins;

	Player(String name, int age, int weight, int wins){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.wins = wins;
	}

	//Getter method for name
	public String getName(){
		return name;
	}

	//Setter method for name
	public void setName(String n){
		name = n;
	}

	//Getter method for age
	public int getAge(){
		return age;
	}

	//Setter method for age
	public void setAge(int a){
		age = a;
	}

	//Getter method for weight
	public int getWeight(){
		return weight;
	}

	//Setter method for weight
	public void setWeight(int w){
		weight = w;
	}

	//Getter method for wins
	public int getWins(){
		return wins;
	}

	//Setter method for wins
	public void setWins(int wi){
		wins = wi;
	}

	@Override
	public int compareTo(Player p){
	 	return name.compareTo(p.getName());
	}

	public String toString(){
		String msg = name + " " + age + " " + weight + " " + wins;
		return msg; 
	}
}

class PlayerComparable{

	/**
    * Main Method
    * @param arg A string array containing 
    * the command line arguments.
    * @return No return value.
    */ 
	public static void main(String[] args){
		
		Player[] players = { new Player("John", 23, 45, 5),
							 new Player("Andy", 20, 55, 7),
							 new Player("Mani", 25, 47, 2),
							 new Player("Bob", 19, 49, 9),
							 new Player("Holly", 21, 50, 2)
							};

		Arrays.sort(players);

		for(Player p: players)
			System.out.println(p.toString());
			
		/*ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("John", 23, 45, 5));
		players.add(new Player("Andy", 20, 55, 7));
		players.add(new Player("Mani", 25, 47, 2));
		players.add(new Player("Bob", 19, 49, 9));
		players.add(new Player("Holly", 21, 50, 2));

		Collections.sort(players);

		for(Player p: players)
			System.out.println(p.toString());*/
	}
}
