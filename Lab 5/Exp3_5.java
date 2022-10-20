//Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program.

interface constant {
    double p = 0.5;
}

class Object implements constant {
    double Failure() {
        return 1 - p;
    }
}

public class Exp3_5 {
    public static void main(String[] args) {
        System.out.print("Probability of failure if probab of success is 0.5 - ");
        Object obj = new Object();
        double failure = obj.Failure();
        System.out.println(failure);
    }
}