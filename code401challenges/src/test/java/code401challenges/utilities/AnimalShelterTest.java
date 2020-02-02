package code401challenges.utilities;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalShelterTest {
    AnimalShelter shelter = new AnimalShelter();

    Animal cat1= new Cat( "Fluffy");
    Animal cat2= new Cat("Spot");
    Animal dog1= new Dog("Ferdinand");
    Animal dog2= new Dog("Rosie");

    @Test
    public void enqueueTest(){
        shelter.animalEnqueue((Cat) cat1);
        shelter.animalEnqueue((Cat) cat2);
        shelter.animalEnqueue((Dog) dog1);
        shelter.animalEnqueue((Dog) dog2);
        Animal current = shelter.dequeue("dog");
        assertEquals(dog2, current);

    }

    @Test
    public void dequeueTest(){
        shelter.animalEnqueue((Cat) cat1);
        shelter.animalEnqueue((Cat) cat2);
        shelter.animalEnqueue((Dog) dog1);
        shelter.animalEnqueue((Dog) dog2);
        shelter.dequeue("dog");
        Animal current = shelter.dequeue("dog");
        assertEquals (dog1, current);

    }



}
