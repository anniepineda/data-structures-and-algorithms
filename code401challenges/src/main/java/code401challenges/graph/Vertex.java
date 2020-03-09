package code401challenges.graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<E>{
    public E value;
    Vertex(E val) {
        this.value = val;
    }
    @Override
    public String toString(){
        return value.toString();
    }
}
