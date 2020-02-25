package code401challenges.graph;

import sun.security.provider.certpath.Vertex;

public class Edge {
    Vertex nodesConnected;
    int weight;
    public Edge(Vertex nodesConnected, int weight){
        this.nodesConnected = nodesConnected;
        this.weight = weight;
    }

}
