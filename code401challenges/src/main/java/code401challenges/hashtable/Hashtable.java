package code401challenges.hashtable;

//Used as a resource: http://www.newthinktank.com/2013/03/java-hash-table/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Hashtable {
    LinkedList<Entry>[] theArray;

    public Hashtable() {
        theArray = new LinkedList[20];
        for(int i = 0; i < theArray.length; i++) {
            theArray[i] = new LinkedList<>();
        }
    }

   public int hash(String str){
        int stringTotal = 1;
        for(int i = 0; i < str.length(); i++){
            stringTotal = stringTotal * str.charAt(i);
        }
        stringTotal %= theArray.length;
        return Math.abs(stringTotal);
   }

   public void add(String key, String value){
        Entry entry = new Entry(key, value);
        int index = hash(key);
        theArray[index].add(entry);
   }

   public String get(String key){
        int index = hash(key);
        if (theArray[index].size()== 1){

            return theArray[index].get(0).value;
        }

        for (Entry entry : theArray[index]){
            if (entry.key.equals(key)){
                return entry.value;
            }
        }

        throw new NoSuchElementException();
   }

   public boolean contains(String key){
       int index = hash(key);

       for (Entry entry : theArray[index]){
           if (entry.key.equals(key)){
               return true;
           }
       }
       return false;
   }


}
