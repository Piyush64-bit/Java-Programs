class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;       // ‘this’ refers to the current instance variable
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("Employee: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}

public class SuperTwoDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        emp.showInfo();
    }
}

// Why this is useful here:
// It avoids ambiguity between constructor parameters and instance variables with the same name
