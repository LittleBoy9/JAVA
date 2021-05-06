// Java code to demonstrate Graph representation
// using LinkedList in Java


import java.util.*;
class CreateGraph{
	static class Edge{
		int source, destination, weight;
		public Edge(int source,int destination,int weight){
			this.source = source;
			this.destination = destination;
			this.weight = weight;
		}
	}

	static class Graph{
		int vertices;
		LinkedList<Edge> adjList[];

		public Graph(int vertices){
			this.vertices = vertices;
			adjList = new LinkedList[vertices];

			for(int i=0; i<vertices; i++){
				adjList[i] = new LinkedList<>();
			}
		}
		public void addEdge(int source, int destination, int weight){
			Edge edge = new Edge(source, destination, weight);
			adjList[source].addFirst(edge);
		}
		public void printGraph(){
			for(int i=0; i<vertices; i++){
				LinkedList<Edge> list = adjList[i];
				for(int j=0;j<list.size();j++){
					System.out.println("Vertex -"+i+" is connected to "+list.get(j).destination+" with weight "+list.get(j).weight);
				}
			}
		}
	}

	public static void main(String[] args) throws Exception{
		int vertices = 6; // 0,1,2,3,4,5,6
		Graph graph = new Graph(vertices);
		graph.addEdge(0,1,8);
		graph.addEdge(0,2,5);
		graph.addEdge(1,0,8);
		graph.addEdge(2,0,5);
		graph.addEdge(2,3,6);
		graph.addEdge(2,4,10);
		graph.addEdge(3,2,6);
		graph.addEdge(3,4,2);
		graph.addEdge(4,2,10);
		graph.addEdge(4,3,2);

		graph.printGraph();


	}
}

// Java code to demonstrate Graph representation
// using ArrayList in Java

/*import java.util.*;

class CreateGraph {

	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v)
	{
		adj.get(u).add(v);
		//adj.get(v).add(u);
	}

	static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj)
	{
		for (int i = 0; i < adj.size(); i++) {
			System.out.print("Adjacency list of " + i+" : ");
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		// Creating a graph with 5 vertices
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

		// Adding edges one by one.
		addEdge(adj, 0,1);
		addEdge(adj, 0,2);
		addEdge(adj, 1,0);
		addEdge(adj, 2,0);
		addEdge(adj, 2,3);
		addEdge(adj, 2,4);
		addEdge(adj, 3,2);
		addEdge(adj, 3,4);
		addEdge(adj, 4,2);
		addEdge(adj, 4,3);

		
		printAdjacencyList(adj);
	}
}
*/