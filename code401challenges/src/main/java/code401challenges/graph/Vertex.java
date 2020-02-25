package code401challenges.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    String vertexNodeName;
    List<Edge>edgesOfVertexOrConnections;

    public Vertex(String vertexNodeName){
        this.vertexNodeName = vertexNodeName;
        this.edgesOfVertexOrConnections = new ArrayList<>();
    }

}
