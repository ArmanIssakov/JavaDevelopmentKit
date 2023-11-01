package homework4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "11111111", "Alan", 1);
        Employee e2 = new Employee(2, "22222222", "Marua", 4);
        Employee e3 = new Employee(3, "33333333", "Baha", 10);

        List<Employee> employees = new ArrayList<>(List.of(e1,e2,e3));

        Directory d1 = new Directory(employees);
        d1.getEmployeeExperience(10);
        d1.getEmployeeId(2);
        d1.getEmployeeName("Baha");
        d1.addEmployee(4, "44444444", "Kolya", 20);
        d1.getEmployeeExperience(20);
    }
}
