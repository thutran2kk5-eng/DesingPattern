package Iterator;

import java.util.List;

public class EmployeeIterator implements IIterator {
    private List<Employee> employees;
    private int position = 0;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return employees.get(position++);
        }
        return null;
    }
}