package code401challenges.stacksandqueues;

//website used for help: https://backtobackswe.com/videos/implement-a-queue-using-stacks

public class PseudoQueue {
    public Stack enqueueStack;
    public Stack dequeueStack;

    public PseudoQueue(){
        this.enqueueStack = new Stack ();
        this.dequeueStack =  new Stack ();
    }

    public void enqueue(int value){
        while(!dequeueStack.isEmpty()){
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);
    }

    public int dequeue(){
        while (!enqueueStack.isEmpty()){
            dequeueStack.push(enqueueStack.pop());
        }
        return dequeueStack.pop();
    }

}
