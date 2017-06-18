/**  
* GraphAdjacencyMatrix --- Program to represent UNDIRECTED graph as Adjacency Matrix
* @author Megha Rastogi
*/

import java.util.*;
public class GraphAdjacencyMatrix{
	
	//2-D array to store adjacency matrix
	private int[][] adjacencyMatrix;
	
	//variable to store size of 2-D array/adjacency matrix
	private int size;
	
	//Constructor to initialize the matrix and size
	public GraphAdjacencyMatrix(int size){
		this.size = size;
		adjacencyMatrix = new int[size][size];
		for(int[] single : adjacencyMatrix)
			Arrays.fill(single, Integer.MIN_VALUE);
	}

    /**
    * Adds edge between sorce and destination.
    * @param source start index
    * @param destinations end index
    * @return No return value.
    */ 
	public void add(int source, int destination){
		adjacencyMatrix[source][destination] = 1;
		adjacencyMatrix[destination][source] = 1;
	}
	
    /**
    * Finds all adjacent vertices of the given vertex
    * @param vertex input vertex
    * @return ArrayList<Integer> storing adjacent vertices of vertex
    */ 
	public ArrayList<Integer> findAdjacent(int index){
		ArrayList<Integer> adjacent = new ArrayList<Integer>();
		for(int i=1;i<size;i++){
			if(adjacencyMatrix[index][i] == 1)
				adjacent.add(i);
		}
		return adjacent;
	}
	
    /**
    * Finds whether vertices start and end are connected 
    * @param source start index
    * @param destination end index
    * @return true if start and end are part of same edge else returns false.
    */
	public boolean isConnected(int source, int destination){
		if(adjacencyMatrix[source][destination] == 1 || adjacencyMatrix[destination][source] == 1)
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
		
		//vertices array
		int[] vertices = {1, 2, 3, 4, 5, 6};
		GraphAdjacencyMatrix graph = new GraphAdjacencyMatrix(vertices.length+1);
		
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
		ArrayList<Integer> adjacent = graph.findAdjacent(1);
		System.out.print("Adjacent of 1 are: ");
		for(int i: adjacent)
			System.out.print(i + " ");
		
		//Find whether vertices 2 and 1 are connected.
		System.out.println();
		System.out.println("2 and 1 are connected: "+graph.isConnected(2,1));
	}
	
}
