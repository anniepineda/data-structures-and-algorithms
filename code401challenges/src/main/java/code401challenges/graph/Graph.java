package code401challenges.graph;

//import org.junit.Before;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public Edge connectEdgeToVertex(Vertex startOfEdge, Vertex endOfEdge, int weight){
        Edge pointGoToStart = new Edge(startOfEdge, weight);
        Edge pointGoToEnd = new Edge(endOfEdge, weight);
        startOfEdge.edgesOfVertexOrConnections.add(pointGoToEnd);
        endOfEdge.edgesOfVertexOrConnections.add(pointGoToStart);

        return pointGoToEnd;
    }

    public ArrayList getVerticesNodes(){
        ArrayList vertex = new ArrayList();
        for(Vertex vertexNew : allVertices){
            vertex.add(vertexNew.vertexNodeName);
        }
        return vertex;
    }

    public List getVertexNeighbors(Vertex allVertexNeighbors){
        return allVertexNeighbors.edgesOfVertexOrConnections;
    }

    //return vertices/nodes in the set
    public int size(){
        return allVertices.size();
    }

    public String toString(Vertex vertex){
        return vertex.vertexNodeName;

    }

    public Boolean doesItHaveEdges(Vertex a, Vertex b){
        return a.edgesOfVertexOrConnections.contains(b.edgesOfVertexOrConnections);
    }


}

