package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//used https://www.baeldung.com/java-graphs for help

public class GraphTest {

    Graph<Integer> input;
    Vertex vertex0, vertex1, vertex2, vertex3;

    @Before
    public void initGraph() {
        input = new Graph<Integer>();
        vertex0 = input.addNode(0);
        vertex1 = input.addNode(1);
        vertex2 = input.addNode(2);
        vertex3 = input.addNode(3);
    }

    @Test
    public void addNodeTest() {
        int actual = input.getSize();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void addEdgeTest() {
        Edge edge01 = input.addEdge(vertex0, vertex1, 100);
        Edge edge02 = input.addEdge(vertex0, vertex2, 100);
        input.addEdge(vertex1, vertex2, 200);
        input.addEdge(vertex2, vertex3, 300);
        Set actual = input.getNeighbors(vertex0);
        Set expected = new HashSet();
        expected.add(edge01);
        expected.add(edge02);
        assertTrue(actual.containsAll(expected));
    }

    @Test
    public void getNodesTest() {
        Set actual = input.getNodes();
        System.out.println("actual = " + actual);
        assertTrue(actual.contains(vertex0));
        assertTrue(actual.contains(vertex1));
        assertTrue(actual.contains(vertex2));
        assertTrue(actual.contains(vertex3));
    }
}

//    @Test
//    public void testSize_NodeAdded () {
//        Graph graph = new Graph();
//        graph.addVertex("Strawberry Shortcake");
//        assertEquals("testSize_NodeAdded should return", 1, graph.size());
//    }
//
//    @Test
//    public void test_AddEdge () {
//        Graph graph = new Graph();
//        Vertex v1 = graph.addVertex("Red Velvet Cake");
//        Vertex v2 = graph.addVertex("Apple Pie");
//        Edge edge = graph.connectEdgeToVertex(v1, v2, 0);
//        ArrayList expected = new ArrayList<>();
//        expected.add(edge);
//        assertEquals(expected, graph.getVertexNeighbors(v1));
//
//    }
//
//
//
//    @Test
//    public void test_Size () {
//        Graph graph = new Graph();
//        graph.addVertex("Chocolate Cake");
//        graph.addVertex("Lemon Poppy Seed Cake");
//        assertEquals("Graph contains this many nodes", 2, graph.size());
//    }
//
//
//
//    @Test
//    public void test_emptyGraph () {
//        Graph graph = new Graph();
//        assertEquals("There are no nodes", 0, graph.size());
//    }





