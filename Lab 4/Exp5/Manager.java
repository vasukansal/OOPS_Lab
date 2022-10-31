package Exp5;

class employee {
    String name;
    int empid;
    int salary;

    employee() {
    }

    employee(String name, int empid, int salary) {
        this();
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    void displayname() {
        System.out.println("Name - " + this.name);
    }

    void displaysalary() {
        System.out.println("Salary - " + this.salary);
    }

    int increasesal(int perc) {
        this.salary = (this.salary * perc / 100) + this.salary;
        return this.salary;
    }

}

public class Manager extends employee {
    public static void main(String[] args) {
        employee obj = new employee("A", 1234, 9999);
        obj.displayname();
        obj.increasesal(20);
        obj.displaysalary();

    }
}
