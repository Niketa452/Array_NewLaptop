import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, 40, "Sam", "IT");
        Employee emp2 = new Employee(2, 42, "John", "Admin");
        Employee emp3 = new Employee(3, 45, "Michael", "Finance");
        Employee emp4 = new Employee(4, 35, "Sarah", "IT");
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        System.out.println("List Before Sorting: ");
        for (Employee eachEmployee : employees) {
            System.out.println(eachEmployee);
        }
        employees.sort(new Comparator<Employee>() {//
            @Override
            public int compare(Employee o1, Employee o2) {

                int comparison = 0;
                comparison = o1.getName().compareTo(o2.getName());
                if (comparison == 0) {
                    o1.getDepartment().compareTo(o2.getDepartment());
                }
                return comparison;
            }
        }
        );
        System.out.println("List after Sorting: ");
        for (Employee eachEmployee : employees) {
            System.out.println(eachEmployee);


        }
    }

}

