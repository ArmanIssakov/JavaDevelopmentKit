package homework4;

import java.util.ArrayList;
import java.util.List;

/*Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник сотрудников*/
public class Directory {

    private List<Employee> employees = new ArrayList<>();

    public Directory(List<Employee> employees) {
        this.employees = employees;
    }

    private void showEmployees(List<Employee> employees){
        for (Employee e:employees) {
            System.out.println(e.getId()+" "+e.getPhoneNumber()+" "+e.getName()+" "+e.getWorkExperience());
        }
    }

    public void getEmployeeExperience(int workExperience){
        List<Employee> employeesExp = new ArrayList<>();
        for (Employee e :employees) {
            if (e.getWorkExperience() == workExperience){
                employeesExp.add(e);
            }
        }
        showEmployees(employeesExp);
    }

    public void getEmployeeName(String name){
        List<Employee> employeesName = new ArrayList<>();
        for (Employee e:employees) {
            if (e.getName().equals(name)){
                employeesName.add(e);
            }
        }
        showEmployees(employeesName);
    }

    public void getEmployeeId(int id){
        List<Employee> employeesId = new ArrayList<>();
        for (Employee e:
             employees) {
            if (e.getId() == id){
                employeesId.add(e);
            }
        }
        showEmployees(employeesId);
    }

    public void addEmployee(int id, String phoneNumber, String name, int workExperience){
        employees.add(new Employee(id, phoneNumber, name, workExperience));
    }

}
