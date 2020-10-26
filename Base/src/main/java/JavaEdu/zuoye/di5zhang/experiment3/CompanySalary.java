package JavaEdu.zuoye.di5zhang.experiment3;

public class CompanySalary {
    public static void main(String[] args) {
        Employee[] employees = new Employee[29];
        for (int i = 0; i < employees.length; i++) {
            if (i % 3 == 0) employees[i] = new WeekWorker();
            else if (i % 3 == 1) employees[i] = new MonthWorker();
            else employees[i] = new YearWorker();
        }
        Company company = new Company(employees);
        System.out.println("公司薪水总额: " + company.salariesPay() + "元");
    }
}

abstract class Employee {
    public abstract double earning();
}

class YearWorker extends Employee {

    @Override
    public double earning() {
        return 2300;
    }
}

class MonthWorker extends YearWorker {

    @Override
    public double earning() {
        return 12 * 2300;
    }
}

class WeekWorker extends MonthWorker {
    @Override
    public double earning() {
        return super.earning();
    }
}

class Company {
    Employee[] employees;
    double salaries = 0;

    Company(Employee[] employees) {
        this.employees = employees;
    }

    public double salariesPay() {
        salaries = 0;

        for (int i = 0; i < employees.length; i++) {
            salaries = salaries + employees[i].earning();
        }

        return salaries;
    }
}
