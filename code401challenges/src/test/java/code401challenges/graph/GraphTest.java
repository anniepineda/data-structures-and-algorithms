package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//used https://www.baeldung.com/java-graphs for help

public class GraphTest {

    Graph<String> colors;
    Graph<String> combinations;

    @Before
    public void setUp() throws Exception{
        colors = new Graph<>();
        colors.addVertex("yellow");
        colors.addVertex("blue");
        colors.addEdge("yellow", "blue", "green");
        colors.addVertex("red");
        colors.addEdge("yellow", "red", "orange");
        colors.addVertex("white");

    }


    @Test
    public void testSize_OneAdded () {
        Graph<String> graph = new Graph<>();
        graph.addVertex("Bob");
        assertEquals("testSize_OneAdded should return", 1, graph.size());
    }


    @Test
    public void testSize_OneAdded () {
        Graph<String> graph = new Graph<>();
        graph.addVertex("Bob");
        assertEquals("testSize_OneAdded should return", 1, graph.size());
    }


    @Test
    public void test_emptyGraph () {
        Graph<String> graph = new Graph<>();
        assertEquals("testSize_NoneAdded should return", 0, graph.size());
    }






}


//    Node can be successfully added to the graph
//    An edge can be successfully added to the graph
//    A collection of all nodes can be properly retrieved from the graph
//    All appropriate neighbors can be retrieved from the graph
//    Neighbors are returned with the weight between nodes included
//    The proper size is returned, representing the number of nodes in the graph
//    A graph with only one node and edge can be properly returned
//    An empty graph properly returns null
