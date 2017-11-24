package Employee;

import java.util.*;

public class Salary {

    public static void main(String[] args) {
        print(Arrays.asList(
                new Employee("Vincent", "Programmer", 21, 33000.00),
                new Employee("Raphael", "System Analyst", 24, 55000.00),
                new Employee("Leonardo", "System Administrator", 23, 65000.00)
        ));
    }

    private static void print(List<Employee> employees) {
        System.out.print("Name" + "\t");
        System.out.print("Age" + "\t");
        System.out.print("Position" + "\t");
        System.out.print("Salary" + "\t");
        System.out.print("Allowance" + "\t");
        System.out.print("Hazard pay" + "\t");
        System.out.print("Tax" + "\t");
        System.out.println("Net pay" + "\t");

        employees.forEach((Employee e) -> {
            System.out.print(e.name + "\t");
            System.out.print(e.age + "\t");
            System.out.print(e.position + "\t");
            System.out.print(e.salary + "\t");
            System.out.print(e.allowance() + "\t");
            System.out.print(e.hazardpay() + "\t");
            System.out.print(e.tax() + "\t");
            System.out.println(e.netpay() + "\t");
        });
    }
}

