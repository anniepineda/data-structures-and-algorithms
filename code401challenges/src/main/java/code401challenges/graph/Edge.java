package code401challenges.graph;


public class Edge {
    Vertex nodesConnected;
    int weight;
    public Edge(Vertex nodesConnected, int weight){
        this.nodesConnected = nodesConnected;
        this.weight = weight;
    }

}
