public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000)
            return (this.salary * 0.03);
        else
            return 0;

    }

    public int bonus() {
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        else
            return 0;

    }

    public double raiseSalary() {
        if (2021 - this.hireYear <= 9)
            return this.salary * 0.05;
        else if (2021 - this.hireYear >= 9 && 2021 - this.hireYear <= 19)
            return this.salary * 0.1;
        else if (2021 - this.hireYear >= 20)
            return this.salary * 0.15;
        else
            return 0;
    }
}



