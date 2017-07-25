/**  
* BFSExample --- Program to find whether path exists between source node and destination node using BFS
* @author Megha Rastogi
*/

import java.util.*;
public class BFSExample{

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
    * pathExists recursive method to find path between source and destination
    * @param HashMap<String, Node> graph 
    * @param source start node
    * @param destinations end node
    * @return true or false
    */ 
	public static boolean pathExists(HashMap<String, Node> graph, String source, String destination){

		//To store the children of nodes visited
        LinkedList<Node> queue = new LinkedList<Node>();

        //To store the visited nodes
        HashSet<String> visited = new HashSet<String>();

        //adding node of startId in the linkedlist
		queue.add(getNode(graph, source));	

		while(!queue.isEmpty()){

			Node parent = queue.remove();

			//Check if current node is the destination node
			if(parent.getId().equals(destination))
				return true;

			//add source to visited set
		    if(visited.contains(parent.getId()))
				continue;
			visited.add(parent.getId());

			//add children to the queue
			for(Node children: parent.getAdjacent())
				queue.add(children);
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
		for(String e: key)
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
		String[] input = {"AB","AE","BC","BF","CG","CD","EF","FG","GH","DH"};

		//Create Graph
		HashMap<String, Node> graph = createGraph(input);

		//Print Graph
		printGraph(graph);
		System.out.println("-----------------------------------");
		
		//Find whether path exists from A to H.
		System.out.println("Path exists between A and H : "+pathExists(graph,"A","F"));

		//Find whether path exists from H to D.
		System.out.println("Path exists between H and D : "+pathExists(graph,"H","D"));
	}

	
}
