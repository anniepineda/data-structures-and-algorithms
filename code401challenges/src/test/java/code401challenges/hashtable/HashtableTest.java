package code401challenges.hashtable;

import org.junit.Test;

import javax.lang.model.SourceVersion;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testAdd(){
        Hashtable h = new Hashtable();
        h.add("Annie", "Green");
        System.out.println(h);
        assertTrue(h.contains("Annie"));
    }

    @Test
    public void testContains(){
        Hashtable h = new Hashtable();
        h.add("Annie", "Green");
        h.add("Jeff", "Blue");
        boolean actual = h.contains("Jeff");
        assertTrue(actual);
    }

    @Test
    public void testGet(){
        Hashtable h = new Hashtable();
        h.add("Annie", "Green");
        h.add("Jeff", "Blue");
        String actual = h.get("Jeff");
//        System.out.println("actual = " + actual);
        String expected = "Blue";
        assertEquals(expected, actual);
    }


}

