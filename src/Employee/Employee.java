package Employee;

public class Employee {
    public String name;
    public int age;
    public String position;
    public double salary;

    public double allowance(){
        return this.salary*0.10;
    }
    public double hazardpay(){
        return this.salary*0.30;
    }
    public double tax(){
        return this.salary*0.05;
    }
    public double netpay(){
        return this.salary + this.hazardpay() + this.allowance() - this.tax();
    }

    public Employee(String name, String position, int age, double salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }
}