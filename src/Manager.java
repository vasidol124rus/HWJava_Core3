

class Manager extends Employee {

    public Manager(int year, int month, int day) {
        super(year, month, day);
    }

    public static void increaseSalary(Employee[] employees, int amount) {
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                // Increase salary
            }
        }
    }
}
