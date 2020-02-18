package code401challenges.hashtable;

//Used as a resource: http://www.newthinktank.com/2013/03/java-hash-table/

import java.util.Arrays;

public class Hashtable {
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;

    public static void main(String[] args) {

        Hashtable theFunc = new Hashtable(30);
        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };
        theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);
        // Locate the value 660 in the Hash Table
        theFunc.findKey("660");
        theFunc.displayTheStack();
    }

    // Hash Function that inputs values
    // index that matches their value

    public void hashtable1(String[] stringsForArray, String[] theArray) {
        for (int n = 0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;

        }

    }


    public void hashFunction2(String[] stringsForArray, String[] theArray) {

        for (int n = 0; n < stringsForArray.length; n++) {
            String newElementVal = stringsForArray[n];
            // Create an index to store the value in by taking the modulus
            int arrayIndex = Integer.parseInt(newElementVal) % 29;
            System.out.println("Modulus Index= " + arrayIndex + " for value "
                    + newElementVal);
            // iterate through the array until we find an empty space
            while (theArray[arrayIndex] != "-1") {
                ++arrayIndex;
                System.out.println("Collision Try " + arrayIndex + " Instead");
                // At end of array go back to index 0
                arrayIndex %= arraySize;
            }
            theArray[arrayIndex] = newElementVal;
        }

    }

    // Returns the value stored in Hashtable

    public String findKey(String key) {
        // Find the keys original hash key
        int arrayIndexHash = Integer.parseInt(key) % 29;

        while (theArray[arrayIndexHash] != "-1") {

            if (theArray[arrayIndexHash] == key) {
                // Found the key so return it
                System.out.println(key + " was found in index "
                        + arrayIndexHash);
                return theArray[arrayIndexHash];
            }

            // Look in the next index
            ++arrayIndexHash;
            // If we get to the end of the array go back to index 0
            arrayIndexHash %= arraySize;
        }
        // If key cannot be found return null

        return null;
    }

    Hashtable(int size) {
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {
            increment += 10;
            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
            for (int n = increment - 10; n < increment; n++) {
                System.out.format("| %3s " + " ", n);
            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
            for (int n = increment - 10; n < increment; n++) {
                if (theArray[n].equals("-1"))
                    System.out.print("|      ");
                else
                    System.out
                            .print(String.format("| %3s " + " ", theArray[n]));
            }

            System.out.println("|");
            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
        }

    }


}
