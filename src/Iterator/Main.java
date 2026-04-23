package Iterator;

public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        
        employeeList.addEmployee(new Employee("Nguyen Van A"));
        employeeList.addEmployee(new Employee("Tran Thi B"));
        employeeList.addEmployee(new Employee("Le Van C"));

        IIterator iterator = employeeList.createIterator();

        System.out.println("--- Employee Names ---");
        while (iterator.hasNext()) {
            Employee emp = (Employee) iterator.next();
            System.out.println("Name: " + emp.getName());
        }
    }
}