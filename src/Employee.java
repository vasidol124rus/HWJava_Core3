

class Employee {
    int year;
    int month;
    int day;

    public Employee(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean compareDates(Employee other) {
        return this.year == other.year && this.month == other.month && this.day == other.day;
    }
}
