package code401challenges.fizzBuzzTree;

public class FizzBuzzNode {
    String value;
    FizzBuzzNode left;
    FizzBuzzNode right;


    public FizzBuzzNode(String value, FizzBuzzNode left, FizzBuzzNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "FizzBuzzNode{" +
                "value='" + value + '\'' +
                '}';
    }
}

