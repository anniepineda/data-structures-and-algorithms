package code401challenges.graph;

import java.util.Iterator;
import java.util.LinkedList;


//Extend your graph object with a breadth-first traversal method that accepts a starting node. Without utilizing any of
// the built-in methods available to your language, return a collection of nodes in the order they were visited.
// Display the collection.


public class BreadthFirst {
    class Graph {
        private int V;
        private LinkedList<Integer> adj[];
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        void BFS(int s) {
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[s] = true;
            queue.add(s);
            while (queue.size() != 0) {
                s = queue.poll();
                System.out.print(s + " ");
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }


}
