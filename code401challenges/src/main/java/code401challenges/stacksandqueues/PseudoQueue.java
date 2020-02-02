package code401challenges.stacksandqueues;

//website used for help: https://backtobackswe.com/videos/implement-a-queue-using-stacks

public class PseudoQueue<E> {
    public Stack<E> enqueueStack;
    public Stack<E> dequeueStack;

    public PseudoQueue(){
        this.enqueueStack = new Stack ();
        this.dequeueStack =  new Stack ();
    }

    public void enqueue(E value){
        while(!dequeueStack.isEmpty()){
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);
    }

    public E dequeue(){
        while (!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
        return dequeueStack.pop();
    }

}
