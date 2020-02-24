package code401challenges.graph;

import sun.security.provider.certpath.Vertex;

//Resources: https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
//https://www.youtube.com/watch?v=gXgEDyodOJU


//////Still working on it.

public class Graph {

    public class Edge<T> {
        private int weight;
        private Vertex<T> vertex;
        public Edge() {}
        public Edge(int weight, Vertex<T> vertex) {
            this.weight = weight;
            this.vertex = vertex;
        }
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        public Vertex<T> getVertex() {
            return vertex;
        }
        public void setVertex(Vertex<T> vertex) {
            this.vertex = vertex;



}


//    AddNode()
//    Adds a new node to the graph
//        Takes in the value of that node
//        Returns the added node
//
//        AddEdge()
//        Adds a new edge between two nodes in the graph
//        Include the ability to have a “weight”
//        Takes in the two nodes to be connected by the edge
//        Both nodes should already be in the Graph
//
//        GetNodes()
//        Returns all of the nodes in the graph as a collection (set, list, or similar)
//
//        GetNeighbors()
//        Returns a collection of nodes connected to the given node
//        Takes in a given node
//        Include the weight of the connection in the returned collection
//
//        Size()
//        Returns the total number of nodes in the graph