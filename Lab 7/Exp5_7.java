import java.util.Scanner;

class exception extends Exception {
    public exception(String str) {
        super(str);
    }
}

class employee {
    String name;
    int age;

    employee(String name, int age) throws exception {
        this.name = name;
        this.age = age;
        if (isNumeric(this.name) == true) {
            throw new exception("Name should be string");
        }
        if (this.age > 50) {
            throw new exception("Age must be less than 50");
        } else {
            System.out.println("Name - " + name);
            System.out.println("Age - " + age);
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

public class Exp5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter the name and age respectively");
        name = sc.nextLine();
        age = sc.nextInt();
        sc.close();
        try {
            employee e1 = new employee(name, age);
        } catch (exception e) {
            System.out.println(e);
        }
    }
}
