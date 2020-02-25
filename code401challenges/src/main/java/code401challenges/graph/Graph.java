package code401challenges.graph;

import org.junit.Before;

import java.util.ArrayList;
import java.util.HashSet;

//Resources: https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
//https://www.youtube.com/watch?v=gXgEDyodOJU
//Silas helped me work thru the challenge


public class Graph {

    HashSet<Vertex> allVertices;

    public Graph(){
        allVertices = new HashSet<>();
    }

    public Vertex addVertex(String nameOfCurrentVertex){
        Vertex v = new Vertex(nameOfCurrentVertex);
        v.vertexNodeName = nameOfCurrentVertex;
        allVertices.add(v);
        return v;
    }

    public void connectEdgeToVertex(Vertex startOfEdge, Vertex endOfEdge, int weight){
        Edge pointGoToEnd = new Edge(endOfEdge, weight);
        startOfEdge.edgesOfVertexOrConnections.add(pointGoToEnd);

        Edge pointGoToStart = new Edge(startOfEdge, weight);
        endOfEdge.edgesOfVertexOrConnections.add(pointGoToStart);
    }

    public ArrayList getVerticesNodes(){
        ArrayList vertex = new ArrayList();
        for(Vertex vertexNew : allVertices){
            vertex.add(vertexNew.vertexNodeName);
        }
        return vertex;
    }

    public ArrayList getVertexNeighbors(Vertex allVertexNeighbors){
        ArrayList verticesThatAreNeighbors = new ArrayList();

        for(Edge edge: allVertexNeighbors.edgesOfVertexOrConnections){
            if(allVertexNeighbors.edgesOfVertexOrConnections.contains(edge)){
                verticesThatAreNeighbors.add(edge.nodesConnected.vertexNodeName);
                verticesThatAreNeighbors.add(edge.weight);
            }
        }
        return verticesThatAreNeighbors;
    }

    //return array.size

    public String toString(Vertex vertex){
        return vertex.vertexNodeName;
    }

    public Boolean doesItHaveEdges(Vertex a, Vertex b){
        return a.edgesOfVertexOrConnections.contains(b.edgesOfVertexOrConnections);
    }


}

