package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

//used https://www.baeldung.com/java-graphs for help

public class GraphTest {


    @Test
    public void testSize_NodeAdded () {
        Graph graph = new Graph();
        graph.addVertex("Strawberry Shortcake");
        assertEquals("testSize_NodeAdded should return", 1, graph.size());
    }

    @Test
    public void test_AddEdge () {
        Graph graph = new Graph();
        Vertex v1 = graph.addVertex("Red Velvet Cake");
        Vertex v2 = graph.addVertex("Apple Pie");
        Edge edge = graph.connectEdgeToVertex(v1, v2, 0);
        ArrayList expected = new ArrayList<>();
        expected.add(edge);
        assertEquals(expected, graph.getVertexNeighbors(v1));

    }



    @Test
    public void test_Size () {
        Graph graph = new Graph();
        graph.addVertex("Chocolate Cake");
        graph.addVertex("Lemon Poppy Seed Cake");
        assertEquals("Graph contains this many nodes", 2, graph.size());
    }



    @Test
    public void test_emptyGraph () {
        Graph graph = new Graph();
        assertEquals("There are no nodes", 0, graph.size());
    }


}


