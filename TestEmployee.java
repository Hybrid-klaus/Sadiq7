package oops.handson.fifthQue;

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee("ABC", 5000000, 2022, "1A2BC3");
        System.out.println(employee.name);
        System.out.println(employee.annualSalary);
        System.out.println(employee.yearOfJoining);
        System.out.println(employee.nationalInsuranceNo);
    }

}