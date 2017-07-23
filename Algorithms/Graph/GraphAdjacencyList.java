/**  
* GraphAdjacencyList --- Program to represent UNDIRECTED graph as Adjacency List
* @author Megha Rastogi
*/

import java.util.*;
public class GraphAdjacencyList{
	
	//HashMap to store all nodes/vertices of the graph
	private static HashMap<Integer,Node> graph = new HashMap<Integer,Node>();
	
	//Default Constructor 
	public GraphAdjacencyList(){
	}

	/**
	* Node --- class to store each vertex along with its adjacent vertices
	*/
	static class Node{		
		
		private int id;
		private ArrayList<Node> adjacent;
		
		public Node(int id){
			this.id = id;
			adjacent = new ArrayList<Node>();
		}
		
		//Getter method for start vertex
		public int getId(){
			return id;
		}
		
		//Getter method for adjacent list
		public ArrayList<Node> getAdjacent(){
			return adjacent;
		}
		
		//add node to the adajcent list
		public void addAdjacent(Node vertex){
			adjacent.add(vertex);
		}

		//To print Node 
        	public String toString(){
			String msg = "";
			for(Node node: adjacent)
				msg = msg + node.id + " ";
			return msg;
        	}
	}

    /**
    * Create and get node corresponding to a vertex.
    * @param id 
    * @return Node object.
    */ 
    private static Node getNode(int id){
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
    * @param source start index
    * @param destinations end index
    * @return No return value.
    */ 
	public void add(int source, int destination){

		//Get nodes corresponding to source and destination vertices.
		Node s = getNode(source);
		Node d = getNode(destination);

		//add nodes to adjacent list
		s.addAdjacent(d);
		d.addAdjacent(s);
	}
	
    /**
    * Finds all adjacent vertices of the given vertex
    * @param vertex input vertex
    * @return ArrayList<Node> storing adjacent vertices of vertex
    */ 
	public ArrayList<Node> findAdjacent(int index){
		Node node = getNode(index);
		return node.getAdjacent();
	}
	
    /**
    * Finds whether vertices start and end are connected 
    * @param source start index
    * @param destination end index
    * @return true if start and end are part of same edge else returns false.
    */
	public boolean isConnected(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);

		if(s.getAdjacent().contains(d) || d.getAdjacent().contains(s))
			return true;
		return false;
	}
	
    /**
    * Main Method
    * @param arg A string array containing 
    * the command line arguments.
    * @return No return value.
    */ 
	public static void main(String args[]){
		

		GraphAdjacencyList graph = new GraphAdjacencyList();
		
		//Add edges of the graph.
		graph.add(1,2);
		graph.add(1,4);
		graph.add(1,5);
		graph.add(2,3);
		graph.add(2,5);
		graph.add(2,6);
		graph.add(3,6);
		graph.add(4,5);
		graph.add(5,6);
		
		//Find adjacent of vertex 1 and print them.
		ArrayList<Node> adjacent = graph.findAdjacent(1);
		System.out.print("Adjacent of 1 are: ");
		for(Node i: adjacent)
			System.out.print(i.getId() + " ");
		
		
		//Find whether vertices 2 and 1 are connected.
		System.out.println();
		System.out.println("2 and 1 are connected: "+graph.isConnected(2,1));
	}
	
}
