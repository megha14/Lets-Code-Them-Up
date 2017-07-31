/**  
* PlayerComparator --- Sort an array/arraylist of Player objects according to their age or weight or wins
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

/**
* AgeComparator --- order Player objects according to their age.
*/
class AgeComparator implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b){
		return new Integer(a.getAge()).compareTo(new Integer(b.getAge()));
	}
}

/**
* WeightComparator --- order Player objects according to their weight.
*/
class WeightComparator implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b){
		return new Integer(a.getWeight()).compareTo(new Integer(b.getWeight()));
	}
}

/**
* WinsComparator --- order Player objects according to their wins.
*/
class WinsComparator implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b){
		return new Integer(a.getWins()).compareTo(new Integer(b.getWins()));
	}
}

/**
* NameWinsComparator --- order Player objects according to their names, if names are same the according to their wins in descending order.
*/
class NameWinsComparator implements Comparator<Player>{
	@Override
	public int compare(Player a, Player b){
		String nameA = a.getName();
		String nameB = b.getName();

		if(nameA.equals(nameB))
			return new Integer(b.getWins()).compareTo(new Integer(a.getWins()));
		else
			return nameA.compareTo(nameB);
	}
}

class PlayerComparator{

	/**
    * Main Method
    * @param arg A string array containing 
    * the command line arguments.
    * @return No return value.
    */ 
	public static void main(String[] args){
		/*
		Player[] players = { new Player("John", 23, 45, 5),
							 new Player("Andy", 20, 55, 7),
							 new Player("John", 25, 47, 2),
							 new Player("Bob", 19, 49, 9),
							 new Player("Holly", 21, 50, 2)
							};

		//Arrays.sort(players);
		//Arrays.sort(players, new AgeComparator());
		//Arrays.sort(players, new WeightComparator());
		//Arrays.sort(players, new WinsComparator());
		Arrays.sort(players, new NameWinsComparator());

		for(Player p: players)
			System.out.println(p.toString());
			*/

		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("John", 23, 45, 5));
		players.add(new Player("Andy", 20, 55, 7));
		players.add(new Player("John", 25, 47, 2));
		players.add(new Player("Bob", 19, 49, 9));
		players.add(new Player("Holly", 21, 50, 2));

		//Collections.sort(players);
		//Collections.sort(players, new AgeComparator());
		//Collections.sort(players, new WeightComparator());
		//Collections.sort(players, new WinsComparator());
		Collections.sort(players, new NameWinsComparator());

		for(Player p: players)
			System.out.println(p.toString());
	}
}
