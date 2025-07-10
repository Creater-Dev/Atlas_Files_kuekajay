import java.util.ArrayList;

class Graph {

    // Inner class to represent an edge
    class Edge {
        int src, dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    int vertex; // number of vertices
    ArrayList<Edge> edges; // list of edges

    // Constructor
    public Graph(int v) {
        vertex = v;
        edges = new ArrayList<>();
    }

    // Method to add an edge
    public void addEdge(int src, int dest) {
        edges.add(new Edge(src, dest));
    }

    // Method to display all edges
    public void displayEdges() {
        System.out.println("Graph Edges:");
        for (Edge e : edges) {
            System.out.println(e.src + " - " + e.dest);
        }
    }

    // Main method
    public static void main(String[] args) {
        Graph graph = new Graph(5); // 5 vertices

        // Add 8 edges
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        // Display the edges
        graph.displayEdges();
    }
}
