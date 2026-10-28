class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %10s%n", "фамилия", "зарплата");
        System.out.println("--------------------------------");
        for (Employee e : employees) {
            System.out.printf("%-15s | %10.2f%n", e.fullname, e.salary);
        }
    }
}

public class z3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ярошевич", 1234.5),
                new Employee("Михалевич", 987.654),
                new Employee("Заяц", 5000.0)
        };

        Report.generateReport(employees);
    }
}