class Employee {
    String empId;
    String empName;
    double salary;
    boolean isIntern;

    Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    Employee(String empId, String empName) {
        this(empId, empName, 0.0);
        this.isIntern = true;
    }

    void printProfile() {
        System.out.printf("%s | %s | Rs %.1f | Intern: %b%n",
                          empId, empName, salary, isIntern);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("E-101", "Divya", 65000);
        Employee e2 = new Employee("E-102", "Arjun");

        e1.printProfile();
        e2.printProfile();
    }
}