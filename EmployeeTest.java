abstract class Employee {
    String name;
    String id;
    int baseSalary;

    public Employee(String name, String id, int baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract void calculateSalary();


    public String displayEmployeeInfo() {
        return "Name: " + name + "\nID: " + id + "\nBase Salary: " + baseSalary;
    }
}


interface Payable {
    void getPaymentAmount();
}

class FullTimeEmployee extends Employee {
    double benefits;

    public FullTimeEmployee(String name, String id, int baseSalary) {
        super(name, id, baseSalary);
        this.benefits = baseSalary * 0.2;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total Salary: " + (baseSalary + benefits));
    }

    @Override
    public String displayEmployeeInfo() {
        return super.displayEmployeeInfo() + "\nBenefits: " + (int) benefits;
    }

}



class ContractEmployee extends Employee implements Payable {
    int hourlyRate;

    public ContractEmployee(String name, String id, int baseSalary, int hourlyRate) {
        super(name, id, baseSalary);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Total Salary: " + baseSalary);
    }

    @Override
    public void getPaymentAmount() {
        System.out.print("Payment Amount: ");
        calculateSalary();
    }

    @Override
    public String displayEmployeeInfo() {
        return super.displayEmployeeInfo() + "\nHourly Rate: " + hourlyRate;
    }
}


public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Nurti", "01", 1400000);
        employees[1] = new ContractEmployee("Kutman", "02", 55000, 12);


        for (Employee e : employees) {
            System.out.println(e.displayEmployeeInfo());

            System.out.println();
        }
    }
}
