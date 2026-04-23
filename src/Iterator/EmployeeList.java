package Iterator;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements IContainer {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public IIterator createIterator() {
        return new EmployeeIterator(this.employees);
    }
}