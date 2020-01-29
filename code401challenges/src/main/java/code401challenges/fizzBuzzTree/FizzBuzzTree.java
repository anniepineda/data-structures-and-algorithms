package code401challenges.fizzBuzzTree;

public class FizzBuzzTree {

    public FizzBuzzNode root;

    public FizzBuzzTree(){

}

private void helper(FizzBuzzNode me){
    int num = Integer.parseInt(me.value);
    if (num % 15 == 0){
        me.value = "FizzBuzz";
    } else if (num % 3 == 0) {
        me.value = "Fizz";
    } else if (num % 5 == 0) {
        me.value = "Buzz";
    }
}

public void traverseFizzBuzzTree(){
    traverseFizzBuzzTree(this.root);
}

private void traverseFizzBuzzTree(FizzBuzzNode me){
    if (me == null){
        return;
    }
    System.out.println(me.value);
    helper(me);
    traverseFizzBuzzTree(me.left);
    traverseFizzBuzzTree(me.right);
}


}



