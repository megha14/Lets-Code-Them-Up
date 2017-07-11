/**  
* DFSExample --- Program to find whether path exists between source node and destination node using DFS
* @author Megha Rastogi
*/

import java.util.*;
public class DFSExample{

	/**
	* Node --- class to store each vertex along with its adjacent vertices
	*/
	static class Node{		
		
		private String id;
		private LinkedList<Node> adjacent;
		
		public Node(String id){
			this.id = id;
			adjacent = new LinkedList<Node>();
		}
		
		//Getter method for start vertex
		public String getId(){
			return id;
		}
		
		//Getter method for end vertex
		public LinkedList<Node> getAdjacent(){
			return adjacent;
		}
		
		//add node to the adajcent list
		public void addAdjacent(Node vertex){
			adjacent.add(vertex);
		}

		//To print Node 
        public String toString(){
     		String msg = id + " : ";
        	for(Node node: adjacent)
        		msg = msg + node.id + " ";
        	return msg;
        }
	}

	/**
    * Create and get node corresponding to a vertex.
    * @param HashMap<String, Node> graph 
    * @param id 
    * @return Node object.
    */ 
    private static Node getNode(HashMap<String, Node> graph, String id){
		if(graph.containsKey(id))
		    return graph.get(id);
        else{
        	Node node = new Node(id);
        	graph.put(id, node);
        	return node;
        }
	}

    /**
    * Adds edge between sorce and destination.
    * @param HashMap<String, Node> graph 
    * @param source start index
    * @param destinations end index
    * @return No return value.
    */ 
	public static void add(HashMap<String, Node> graph, String source, String destination){

		//Get nodes corresponding to source and destination vertices.
		Node s = getNode(graph, source);
		Node d = getNode(graph, destination);

		//add nodes to adjacent list
		s.addAdjacent(d);
	}

	/**
    * Creates a HashMap with string key and Node value
    * @param input list of edges
    * @return HashMap<String,Node>
    */ 
	public static HashMap<String, Node> createGraph(String[] input){
		HashMap<String, Node> graph = new HashMap<String, Node>();
		Node node;
		for(String s: input){
			String first = String.valueOf(s.charAt(0));
			String second = String.valueOf(s.charAt(1));
			add(graph, first, second);
		}
		return graph;
	}

	/**
    * Helper method for pathExists recursive method
    * @param HashMap<String, Node> graph 
    * @param source start index
    * @param destinations end index
    * @return true or false
    */ 
	public static boolean pathExists(HashMap<String, Node> graph, String source, String destination){
		HashSet<Node> visited = new HashSet<Node>();
		return pathExists(getNode(graph, source), getNode(graph, destination), visited);
	}

	/**
    * pathExists recursive method to find path between source and destination
    * @param source start index
    * @param destinations end index
    * @param visited set to store visited nodes
    * @return true or false
    */ 
	public static boolean pathExists(Node source, Node destination, HashSet<Node> visited){
		//return false if visited contains source
    if(visited.contains(source))
			return false;

    //add source to visited
		visited.add(source);

    //return true if source and destination are same
		if(source == destination)
			return true;
    
    //call DFS on each node present in the adjacent of source
		for(Node neighbor : source.getAdjacent()){
			if(pathExists(neighbor, destination, visited))
				return true;
		}
		return false;
	}

	/**
    * Print HashMap
    * @param HashMap<String, Node> graph 
    * @return no return value
    */ 
	public static void printGraph(HashMap<String,Node> graph){
		HashSet<String> key = new HashSet<String>(graph.keySet());
		for(Object e: key)
			System.out.println(graph.get(e));
	}
	
    /**
    * Main Method
    * @param arg A string array containing 
    * the command line arguments.
    * @return No return value.
    */ 
	public static void main(String args[]){
		
		//Input edges of the graph.
		String[] input = {"AB","BC","BE","CF","DE","EF"};

		//Create Graph
		HashMap<String, Node> graph = createGraph(input);

		//Print Graph
		printGraph(graph);
		System.out.println("-----------------------------------");
		
		//Find whether path exists from A to F.
		System.out.println("Path exists between A and F : "+pathExists(graph,"A","F"));

		//Find whether path exists from A to D.
		System.out.println("Path exists between A and D : "+pathExists(graph,"A","D"));
	}

	
}
