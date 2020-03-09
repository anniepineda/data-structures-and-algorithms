package code401challenges.graph;

import java.util.Iterator;
import java.util.LinkedList;



public class DepthFirst {
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

        void DFS(int s) {
            boolean visited[] = new boolean[V];
            LinkedList<Integer> stack = new LinkedList<Integer>();
            visited[s] = true;
            stack.add(s);
            while (stack.size() != 0) {
                s = stack.pop();
                System.out.print(s + " ");
                Iterator<Integer> i = adj[s].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        stack.push(n);
                    }
                }
            }
        }
    }


}
