public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1990, 5, 15);
        Manager manager = new Manager(1975, 10, 25);

        Employee[] employees = {emp1, manager};

        Manager.increaseSalary(employees, 1000);

        for (Employee emp : employees) {
            System.out.println("Employee's salary: " + emp.year + "-" + emp.month + "-" + emp.day);
        }
    }
}