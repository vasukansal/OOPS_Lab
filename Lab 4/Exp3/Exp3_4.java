//Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every workerhas a name and a salary rate. Write method ComPay (int hours) to compute the week pay of everyworker. A Daily Worker is paid on the basis of the number of days he/she works. The SalariedWorker gets paid the wage for 40 hours a week no matter what the actual hours are. Test thisprogram to calculate the pay of workers.

package Exp3;

class Worker {
    String name;
    int Salary;
    int rate = 100;

    void display() {
        System.out.println("Name - " + this.name);
    }

}

class Daily_Worker extends Worker {
    int hours;

    void compay(int hours) {
        this.hours = hours;
        super.Salary = this.hours * super.rate;
    }

    void display() {
        super.display();
        System.out.println("Salary - " + super.Salary);
    }
}

class Salaried_worker extends Worker {
    void compay() {
        super.Salary = super.rate * 40;
    }

    void display() {
        super.display();
        System.out.println("Salary - " + super.Salary);
    }
}

public class Exp3_4 {
    public static void main(String[] args) {
        Daily_Worker dw = new Daily_Worker();
        Salaried_worker sw = new Salaried_worker();
        dw.name = "Ramesh";
        sw.name = "Suresh";
        dw.compay(45);
        sw.compay();
        dw.display();
        sw.display();
    }
}
