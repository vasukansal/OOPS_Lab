//Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning.The charges depend on the duration and the type of the call. 

package Exp4;

class trunk {
    String type;
    int cost;

    void display() {
        System.out.println("Type - " + this.type);
    }
}

class ordinary extends trunk {
    ordinary() {
        type = "ordinary";
    }

    int duration_minutes;

    void display(int duration_minutes) {
        super.display();
        this.duration_minutes = duration_minutes;
        super.cost = 5 * this.duration_minutes;
        System.out.println("Charge - " + super.cost);
    }
}

class urgent extends trunk {
    urgent() {
        type = "Urgent";
    }

    int duration_minutes;

    void display(int duration_minutes) {
        super.display();
        this.duration_minutes = duration_minutes;
        super.cost = 10 * this.duration_minutes;
        System.out.println("Charge - " + super.cost);
    }
}

class lightning extends trunk {
    lightning() {
        type = "Lightning";
    }

    int duration_minutes;

    void display(int duration_minutes) {
        super.display();
        this.duration_minutes = duration_minutes;
        super.cost = 15 * this.duration_minutes;
        System.out.println("Charge - " + super.cost);
    }
}

public class Exp4_4 {
    public static void main(String[] args) {
        ordinary ord = new ordinary();
        urgent urg = new urgent();
        lightning lig = new lightning();
        ord.display(10);
        urg.display(10);
        lig.display(10);
    }
}
