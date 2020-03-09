package code401challenges.graph;

//import org.junit.Before;
import java.util.*;

//Resources: https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
//https://www.youtube.com/watch?v=gXgEDyodOJU

public class Graph<E> {
    private Map<Vertex<E>, Set<Edge<E>>> vertices;
    public Graph(){
        vertices = new HashMap<>();
    }
    // AddNode()
//Adds a new node to the graph
//Takes in the value of that node
//Returns the added node
    public Vertex<E> addNode(E value){
        if (value != null){
            Vertex<E> newNode;
            newNode = new Vertex<>(value);
            vertices.putIfAbsent(newNode, new HashSet<>());
            return newNode;
        } else {
            throw new IllegalArgumentException("no empty values please");
        }
    }
    public Edge<E> addEdge(Vertex<E> from, Vertex<E> to, int weight){
        if (vertices.containsKey(from) && vertices.containsKey(to)) {
            // create an edge "from" to "to"
            Edge<E> fromToEdge = new Edge<>(from, to, weight);
            Set<Edge<E>> getFromNeighbor = vertices.get(from);
            getFromNeighbor.add(fromToEdge);

            // create an edge "to" to "from"
            Edge<E> toFromEdge = new Edge<>(to, from, weight);
            Set<Edge<E>> getToNeighbor = vertices.get(to);
            getToNeighbor.add(toFromEdge);
            return fromToEdge;
        }
        throw new IllegalArgumentException("no empty values please");
    }
    public Set<Vertex<E>> getNodes(){
        return vertices.keySet();
    }
    public Set<Edge<E>> getNeighbors(Vertex<E> vertex){
        return vertices.get(vertex);
    }
    public int getSize(){
        return vertices.size();
    }


    // Breadth First

    public List<Vertex<E>> breadthFirst(Vertex<E> start){
        List<Vertex<E>> result = new LinkedList<>();
        Set<Vertex<E>> seen = new HashSet<>();
        Queue<Vertex<E>> queue = new LinkedList<>();
//        LinkedList<Graph<E>> nodesToProcess = new LinkedList<>();
        if(!this.vertices.containsKey(start)){
            throw new IllegalArgumentException("Vertex outside of graph");
        }


        queue.add(start);
        seen.add(start);
        while (!queue.isEmpty()){
            Vertex<E> current = queue.poll();
            result.add(current);
            Set<Edge<E>> neighbors = this.vertices.get(current);

            for(Edge<E> neighbor : neighbors){
                if(!seen.contains(neighbor)){
                    seen.add(neighbor.to);
                    queue.add(neighbor.to);
                }
            }
        }
        return result;
    }


    //Depth First

    public List<Vertex<E>> depthFirst(Vertex<E> start){
        List<Vertex<E>> result = new LinkedList<>();
        Set<Vertex<E>> seen = new HashSet<>();
        Stack<Vertex<E>> stack = new Stack<>();

        if(!this.vertices.containsKey(start)){
            throw new IllegalArgumentException("Vertex outside of graph");
        }


        stack.push(start);
        seen.add(start);
        while (!stack.isEmpty()){
            Vertex<E> current = stack.pop();
            result.add(current);
            Set<Edge<E>> neighbors = this.vertices.get(current);

            for(Edge<E> neighbor : neighbors){
                if(!seen.contains(neighbor)){
                    seen.add(neighbor.to);
                    stack.add(neighbor.to);
                }
            }
        }
        return result;
    }


    //Lab 37 Alaska Airlines

    public static Connection alaskaAirlines(Graph<String> graph, String[] cities){
        if(cities.length < 2){
            throw new IllegalArgumentException("No connecting flights");
        }

        int totalPrice = 0;

        for(int i = 0; i < cities.length-1; i++){
            if(!graph.vertices.containsKey(cities[i])){
                return new Connection(false, 0);
            }
            Set<Edge<String>> neighbors = graph.vertices.get(cities[i]);
            if(!neighbors.contains(cities[i + 1])){
                return new Connection(false, 0);
            }
            for(Edge<String> edge: neighbors){
                if(edge.to.value.equals(cities[i + 1])){
                    totalPrice += edge.weight;
                }
            }

        }
        return new Connection(true, totalPrice);

    }


}

