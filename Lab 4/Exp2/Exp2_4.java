//Write a program in Java to create a Player class. 
//Inherit the classes Cricket _Player, Football_Player and Hockey_ Player from Player class.

class player {
    String name;
    int age;

    public player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name - " + name + ", Age - " + age;
    }
}

class Cricket_player extends player {
    String type;

    public Cricket_player(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String toString() {
        return super.toString() + ", Type - " + type;
    }
}

class Football_player extends player {
    String type;

    public Football_player(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String toString() {
        return super.toString() + ", Type" + type;
    }
}

class Hockey_player extends player {
    String type;

    public Hockey_player(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String toString() {
        return super.toString() + ", Type - " + type;
    }
}

public class Exp2_4 {
    public static void main(String[] args) {
        Cricket_player c1 = new Cricket_player("Kohli", 35, "batsman");
        Football_player f1 = new Football_player("Messi", 40, "Striker");
        Hockey_player h1 = new Hockey_player("XYZ", 29, "Keeper");
        System.out.println(c1.toString());
        System.out.println(f1.toString());
        System.out.println(h1.toString());
    }
}