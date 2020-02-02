package code401challenges.utilities;

///Daesy helped me with this code challenge
import code401challenges.stacksandqueues.Queue;
import org.checkerframework.checker.units.qual.A;

public class AnimalShelter {
    //
    public Queue<Cat> catQueue;
    public Queue<Dog> dogQueue;

    public AnimalShelter(){
        catQueue = new Queue();
        dogQueue = new Queue();
    }

    public void animalEnqueue(Dog dog) { dogQueue.enqueue(dog);}
    public void animalEnqueue(Cat cat) {catQueue.enqueue(cat);}

    public Animal dequeue(String preference){
        if (preference.toLowerCase().equals("cat")){
            return catQueue.dequeue();
        }
        else if(preference.toLowerCase().equals("dog")){
            return catQueue.dequeue();
        }
        throw new IllegalArgumentException("Enter Dog or Cat");
    }


}
