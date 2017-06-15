/**  
* GraphEdgeList --- Program to represent UNDIRECTED graph as Vertices and Edges List
* @author Megha Rastogi
*/

import java.util.*;
public class GraphEdgeList{
	
	/**
	* Edge --- class to store an edge between Starte vertex and End vertex
	*/
	class Edge{		
		
		private int startVertex;
		private int endVertex;
		
		public Edge(int startVertex, int endVertex){
			this.startVertex = startVertex;
			this.endVertex = endVertex;
		}
		
		//Getter method for start vertex
		public int getStartVertex(){
			return startVertex;
		}
		
		//Getter method for end vertex
		public int getEndVertex(){
			return endVertex;
		}
		
	}
	
	//List verticesList to store vertices
	private static ArrayList<Integer> verticesList;
	
	//List edgesList to store edges
	private static ArrayList<Edge> edgesList;
	
   /**
   * Adds vertex start to the verticesList if not already present
   * and edge between start and end to the edgesList
   * @param start start index
   * @param end end index
   * @return No return value.
   */ 
	public void add(int start, int end){
		if(!verticesList.contains(start)){
			verticesList.add(start);
		}
		edgesList.add(new Edge(start, end));
	}
	
	
   /**
   * Finds all adjacent vertices of the given vertex
   * @param vertex input vertex
   * @return ArrayList<Integer> storing adjacent vertices of vertex
   */ 
	public ArrayList<Integer> findAdjacent(int vertex){
		ArrayList<Integer> adjacent = new ArrayList<Integer>();
		for(Edge edge: edgesList){
			if(edge.getStartVertex() == vertex)
				adjacent.add(edge.getEndVertex());
			else if(edge.getEndVertex() == vertex)
				adjacent.add(edge.getStartVertex());
		}
		return adjacent;
	}
	
   /**
   * Finds whether vertices start and end are connected 
   * @param start start index
   * @param end end index
   * @return true if start and end are part of same edge else returns false.
   */ 
	public boolean isConnected(int start, int end){
		for(Edge edge: edgesList){
			if((edge.getStartVertex() == start && edge.getEndVertex() == end) ||
				(edge.getStartVertex() == end && edge.getEndVertex() == start))
				return true;
		}
		return false;
	}
	
   /**
   * Main Method
   * @param arg A string array containing 
   * the command line arguments.
   * @return No return value.
   */ 
	public static void main(String args[]){
		
		GraphEdgeList graph = new GraphEdgeList();
		verticesList = new ArrayList<Integer>();
		edgesList = new ArrayList<Edge>();
		
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
