package employees;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        // Dodawanie pracowników do tablicy
        employees[0] = new Manager("John Doe", 70000, 0);
        employees[1] = new Worker("Jane Smith", 60000, "Developer");
        employees[2] = new Employee("Alice Johnson", 70000);
        employees[3] = new Employee("Bob Brown", 55000);
        employees[4] = new Worker("Emily Davis", 65000, "Designer");
        employees[5] = new Manager("Michael Green", 80000, 0);
        employees[6] = new Worker("David Lee", 55000, "Engineer");

        // Ustawienie nowej wartości salary dla wszystkich pracowników
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        // Ustawienie nowych wartości numberOfSubordinates oraz salary dla Managerów
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2);
                employee.setSalary(75000);
            }
        }

        // Wyświetlenie zaktualizowanych informacji o pracownikach za pomocą metody toString
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}