class Employee{
    String name;
    double salary;
    int age;
    char alpha;

    //creating the constructor here
    Employee(String name,double salary, int age, char alpha){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.alpha = alpha;
        
    }

    void showinfo(){
        System.out.println("Employee:"+ this.name);
        System.out.println("Salary :"+ this.salary);
        System.out.println("Age :"+ this.age);
        System.out.println("Alphbet :"+ this.alpha);
    }
};

public class SuperDemoTwo{
    public static void main(String[] args) {
        Employee emp = new Employee("John",50000 ,23,'A');
        emp.showinfo();
    }
}