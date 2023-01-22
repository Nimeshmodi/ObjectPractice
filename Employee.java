package Object;

public class Employee {
    String EmployeeName = "Nimesh";
    int EmployeeId = 07;
    int EmployeeSalary = 80000;

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.EmployeeName);
        System.out.println(obj.EmployeeId);
        System.out.println(obj.EmployeeSalary);
    }
}
